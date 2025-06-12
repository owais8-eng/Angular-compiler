package AST;

import java.util.HashMap;
import java.util.Map;

public class MapSymbol {

    Map<String,Object> stringMap;

    public MapSymbol() {
        this.stringMap = new HashMap<>();
    }
    public void addVariable(String varaibleName,Object value) {
        stringMap.put(varaibleName,value);
    }
    public void updateVariable(String variableName,Object newValue) {
        if (stringMap.containsKey(variableName)) {
            stringMap.put(variableName,newValue);
        }else {
            System.out.println("variable" + variableName + "does not exist in symbol table");
        }
    }

    public Object getValue(String variableName){
        if (stringMap.containsKey(variableName)){
            return stringMap.get(variableName);
        }else {
            System.out.println("Variable " + variableName + " does not exist in the symbol table.");
            return null;
        }
    }
    public void print() {
        if (stringMap.isEmpty()) {
            System.out.println("Symbol table is empty.");
            return;
        }

        String format = "| %-20s | %-30s |\n";
        String separator = "+----------------------+--------------------------------+\n";

        System.out.print(separator);
        System.out.printf(format, "Symbol Name", "Symbol Value");
        System.out.print(separator);

        for (Map.Entry<String, Object> entry : stringMap.entrySet()) {
            String name = entry.getKey();
            String value = String.valueOf(entry.getValue());

            System.out.printf(format, name, value);
        }

        System.out.print(separator);
    }

}
