package AST;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
    public void add(String name ,String type, String value,String scope) {
        if (type == null || value == null ||name == null ||scope == null || type.isEmpty() || value.isEmpty()||name.isEmpty() || scope.isEmpty()) {
            throw new IllegalArgumentException(" name, Scope ,Type and value cannot be null or empty.");
        }
        for (Row row : rows) {
            if (row.getName().equals(name)&&row.getScope().equals(scope) &&row.getType().equals(type) && row.getValue().equals(value)) {
                System.out.println("Duplicate entry :name"+ name +"Duplicate entry: Type = " + type + ", Value = " + value + "Duplicate entry scope :" + scope);
                return;
            }
        }
        Row row = new Row();
        row.setName(name);
        row.setType(type);
        row.setValue(value);
        row.setScope(scope);
        rows.add(row);
    }

    public void clear() {
        rows.clear();
    }
    public void print() {
        if (rows.isEmpty()) {
            System.out.println("Symbol table is empty.");
            return;
        }

        // Header
        String format = "| %-20s | %-30s | %-20s | %-20s |\n";
        String separator = "+----------------------+--------------------------------+----------------------+----------------------+\n";

        System.out.print(separator);
        System.out.printf(format, "Symbol Name", "Symbol Value", "Symbol Type", "Symbol Scope");
        System.out.print(separator);

        // Data rows
        for (Row row : rows) {
            if (row != null) {
                System.out.printf(format,
                        row.getName() != null ? row.getName() : "",
                        row.getValue() != null ? row.getValue() : "",
                        row.getType() != null ? row.getType() : "",
                        row.getScope() != null ? row.getScope() : "");
            }
        }
        System.out.print(separator);
    }

}
