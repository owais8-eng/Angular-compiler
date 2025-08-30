package CodeGeneration.generators;

import AST.*;
import Antlr.AngParser;
import CodeGeneration.CodeGenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class JSGenerator implements CodeGenerator<App> {

    @Override
    public String generate(App app) {
        if (app == null) return "";
        return renderApp(app);
    }

    @Override
    public void writeToFile(String content, String outputPath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            writer.write(content);
        }
    }

    private String renderApp(App root) {
       StringBuilder sb = new StringBuilder();
       if (root.getImportRS() != null) {
           for (ImportR imp : root.getImportRS()) {
               sb.append(renderImport(imp)).append("\n");
           }
       }
        if (root.getVariables() != null) {
            for (Variable var : root.getVariables()) {
                sb.append(renderVariable(var)).append("\n");
            }
        }
        if (root.getFunctions() != null) {
            for (function func : root.getFunctions()) {
                sb.append(renderFunction(func)).append("\n");
            }
        }
        if (root.getExports() != null) {
            for (Exports exp : root.getExports()) {
                sb.append(renderExport(exp)).append("\n");
            }
        }
        if (root.getEnumS() != null) {
            for (enum_ en : root.getEnumS()) {
                sb.append(renderEnum(en)).append("\n");
            }
        }
        if (root.getInterfaceCodes() != null) {
            for (interfaceCode inter : root.getInterfaceCodes()) {
                sb.append(renderInterface(inter)).append("\n");
            }
        }
        return sb.toString();
    }

    private String renderImport(ImportR imp) {
        StringBuilder sb = new StringBuilder();
        sb.append("import { ");
        sb.append(String.join(", ", imp.getIdentifiers()));
        sb.append(" } from '").append(imp.getFrom()).append("';");
        return sb.toString();
    }

    private String renderVariable(Variable node) {
        StringBuilder sb = new StringBuilder();
        sb.append("let ").append(String.join(".", node.getNameParts()));
        if (node.getValue() != null) sb.append(" = ").append(renderVariableValue(node.getValue()));
        sb.append(";");
        return sb.toString();
    }

    private String renderVariableValue(VariableValue value) {
        if (value == null) return "null";
        if (value.getString() != null) return "\"" + value.getString() + "\"";
        if (value.getDecimal() != null) return value.getDecimal().toString();
        if (value.getId() != null) return value.getId();
        if (value.getArray() != null) return renderArray(value.getArray());
        if (value.getMap() != null) return renderMap(value.getMap());
    //    if (value.getCallFun() != null) return renderCallFun(value.getCallFun());
        return "null";
    }

    private String renderSubValue(SubValue sv) {
        if (sv.getString() != null) return "\"" + sv.getString() + "\"";
        if (sv.getId() != null) return sv.getId();
        if (sv.getDecimal() != null) return sv.getDecimal().toString();
        return "";
    }

    private String renderArray(AST.Array arrayNode) {
        if (arrayNode == null || arrayNode.getSubValues() == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arrayNode.getSubValues().size(); i++) {
            SubValue sv = arrayNode.getSubValues().get(i);
            sb.append(renderSubValue(sv));
            if (i < arrayNode.getSubValues().size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


    private String renderMap(AST.Map mapNode) {
        if (mapNode == null || mapNode.getMap().isEmpty()) return "{}";
        StringBuilder sb = new StringBuilder("{");
        int i = 0, size = mapNode.getMap().size();
        for (java.util.Map.Entry<String, Object> entry : mapNode.getMap().entrySet()) {
            sb.append(entry.getKey()).append(": ");
            Object value = entry.getValue();
            if (value instanceof Value v) sb.append(renderValue(v));
            else if (value instanceof SubValue sv) sb.append(renderSubValue(sv));
            else sb.append("null");
            if (i < size - 1) sb.append(", ");
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    private String renderValue(Value v) {
        if (v == null) return "null";

        if (v.getSubValue() != null) return renderSubValue(v.getSubValue());
        if (v.getArray() != null) return renderArray(v.getArray());
        if (v.getMap() != null) return renderMap(v.getMap());
        return "null"; // HTML ignored in JSGenerator
    }

    private String renderFunction(function func) {
        StringBuilder sb = new StringBuilder();
        sb.append("function ").append(func.getName()).append("(");
        if (func.getFunctionParams() != null && !func.getFunctionParams().isEmpty()) {
            for (int i = 0; i < func.getFunctionParams().size(); i++) {
                sb.append(func.getFunctionParams().get(i));
                if (i < func.getFunctionParams().size() - 1) sb.append(", ");
            }
        }
        sb.append(") {\n");


        sb.append("}\n");
        return sb.toString();
    }

    private String renderCallFun(callFun cf) {
        if (cf == null) return "";

        StringBuilder sb = new StringBuilder();
        if (cf.isAwait()) sb.append("await ");

        if (cf instanceof navigateCall nav) {
            sb.append("navigate('").append(nav.getPath()).append("')");
            if (nav.getStateParam() != null) sb.append(", ").append(renderStateParamSimple(nav.getStateParam()));
        } else if (cf instanceof routerCall router) {
            sb.append(router.isThis() ? "this." : "")
                    .append(router.getRouterName())
                    .append(".navigate('").append(router.getPath()).append("')");
            if (router.getStateParam() != null) sb.append(", ").append(renderStateParamSimple(router.getStateParam()));
        } else {
            sb.append(cf.toString()); // generalCall بسيط يمكن تعديله حسب الحاجة
        }

        return sb.toString();
    }

    private String renderStateParamSimple(stateParam param) {
        if (param == null) return "{}";
        StringBuilder sb = new StringBuilder("{ ");
        sb.append(param.getKey()).append(": ");

        if (param.getValue() instanceof SubValue sv) {
            sb.append(renderSubValue(sv));
        } else if (param.getValue() instanceof VariableValue vv) {
            sb.append(renderVariableValue(vv));
        } else if (param.getValue() instanceof AST.Array arr) {
            sb.append(renderArray(arr));
        } else if (param.getValue() instanceof AST.Map map) {
            sb.append(renderMap(map));
        } else {
            sb.append("null");
        }

        sb.append(" }");
        return sb.toString();
    }

    private String renderPrint(Print print) {
        if (print == null) return  "";

        StringBuilder stringBuilder = new StringBuilder("console.log(");
        if (print.getThisCall() != null) stringBuilder.append(print.getThisCall().toString());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private String renderExport(Exports exports) {
        StringBuilder sb = new StringBuilder();
        String className = exports.getIds().get(0);
        sb.append("class ").append(className);
        if (exports.getClassBody() != null) sb.append(" {\n").append(renderClassBody(exports.getClassBody())).append("\n}");
        else sb.append(" { }");
        return sb.toString();
    }

    private String renderClassBody(classBody body) {
        StringBuilder sb = new StringBuilder();
        if (body.getVariables() != null) for (Variable var : body.getVariables()) sb.append("  ").append(renderVariable(var)).append("\n");
        if (body.getFunctions() != null) for (function func : body.getFunctions()) sb.append("  ").append(renderFunction(func)).append("\n");
        return sb.toString();
    }

    private String renderEnum(enum_ en) {
        if (en == null) return "";
        StringBuilder sb = new StringBuilder("enum ").append(en.getName()).append(" {");
        if (en.getIds() != null) {
            for (int i = 0; i < en.getIds().size(); i++) {
                sb.append(en.getIds().get(i));
                if (i < en.getIds().size() - 1) sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private String renderInterface(interfaceCode code) {
        if (code == null) return "";
        StringBuilder sb = new StringBuilder("interface ").append(code.getName()).append(" {\n");
        for (String id : code.getIds()) {
            sb.append("  ").append(id).append(": any;\n");
        }
        sb.append("}\n");
        return sb.toString();
    }


    //------------






    public String renderProductsDOM(String varName) {
        return """
                document.addEventListener('DOMContentLoaded', function() {
                           const form = document.getElementById('add-product-form');
                           const imageInput = document.getElementById('product-image');
                           const previewImg = document.getElementById('preview-img');
                           const previewText = document.getElementById('preview-text');
                           const notification = document.getElementById('notification');
                           const cancelBtn = document.getElementById('cancel-btn');
    
                           imageInput.addEventListener('change', function() {
                               const file = this.files[0];
                               if (file) {
                                   const reader = new FileReader();
    
                                   reader.addEventListener('load', function() {
                                       previewImg.src = reader.result;
                                       previewImg.style.display = 'block';
                                       previewText.style.display = 'none';
                                   });
   
                                   reader.readAsDataURL(file);
                               } else {
                                   previewImg.style.display = 'none';
                                   previewText.style.display = 'block';
                               }
                           });
                
                           form.addEventListener('submit', function(e) {
                               e.preventDefault();
                
                               showNotification('تم إضافة المنتج بنجاح!');
                
                               setTimeout(function() {
                                   form.reset();
                                   previewImg.style.display = 'none';
                                   previewText.style.display = 'block';
                               }, 2000);
                           });
                
                           cancelBtn.addEventListener('click', function() {
                               if (confirm('هل تريد حقاً إلغاء عملية الإضافة؟ سيتم فقدان جميع البيانات.')) {
                                   form.reset();
                                   previewImg.style.display = 'none';
                                   previewText.style.display = 'block';
                               }
                           });
                
                           function showNotification(message) {
                               notification.textContent = message;
                               notification.classList.add('show');
                
                               setTimeout(function() {
                                   notification.classList.remove('show');
                               }, 3000);
                           }
                       });
    """.formatted(varName);
    }



}
