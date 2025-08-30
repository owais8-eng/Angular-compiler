import os
import zipfile
import re
import math

zip_path = "AST.zip"
output_root = "ast_groups"
group_size = 10

java_files = []

with zipfile.ZipFile(zip_path, 'r') as zip_ref:
    for file in zip_ref.namelist():
        if file.endswith(".java"):
            java_files.append(file)

total_groups = math.ceil(len(java_files) / group_size)

with zipfile.ZipFile(zip_path, 'r') as zip_ref:
    for i in range(total_groups):
        group_folder = os.path.join(output_root, f"group_{i+1}")
        os.makedirs(group_folder, exist_ok=True)
        
        group_files = java_files[i*group_size:(i+1)*group_size]
        
        puml_path = os.path.join(group_folder, f"group_{i+1}.puml")
        with open(puml_path, "w", encoding="utf-8") as puml_file:
            puml_file.write("@startuml\n")
            
            for file in group_files:
                content = zip_ref.read(file).decode('utf-8')
                
                # استخراج اسم الكلاس
                class_match = re.search(r'class\s+(\w+)', content)
                if class_match:
                    class_name = class_match.group(1)
                    puml_file.write(f"class {class_name} {{\n")
                    
                    # استخراج الحقول: visibility + type + name
                    field_pattern = r'(public|private|protected)\s+([\w<>]+)\s+(\w+)\s*;'
                    for match in re.findall(field_pattern, content):
                        visibility, typ, name = match
                        visibility_symbol = "+" if visibility=="public" else "-" if visibility=="private" else "#"
                        puml_file.write(f"    {visibility_symbol} {name} : {typ}\n")
                    
                    # استخراج الدوال: visibility + return type + name + params
                    method_pattern = r'(public|private|protected)\s+([\w<>]+)\s+(\w+)\s*\(([^)]*)\)'
                    for match in re.findall(method_pattern, content):
                        visibility, ret_type, name, params = match
                        visibility_symbol = "+" if visibility=="public" else "-" if visibility=="private" else "#"
                        puml_file.write(f"    {visibility_symbol} {name}({params}) : {ret_type}\n")
                    
                    puml_file.write("}\n")
                    
                    # extends
                    extends_match = re.search(r'class\s+\w+\s+extends\s+(\w+)', content)
                    if extends_match:
                        parent = extends_match.group(1)
                        puml_file.write(f"{parent} <|-- {class_name}\n")
                    
                    # implements
                    implements_match = re.search(r'class\s+\w+\s+.*implements\s+([\w, ]+)', content)
                    if implements_match:
                        interfaces = [x.strip() for x in implements_match.group(1).split(',')]
                        for iface in interfaces:
                            puml_file.write(f"{iface} <|.. {class_name}\n")
            
            puml_file.write("@enduml\n")

print(f"تم إنشاء ملفات Class Diagram مفصلة مع الحقول والدوال لكل مجموعة داخل: {output_root}")
