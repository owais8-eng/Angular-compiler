package SemanticError;

public class VariableRedefinitionError extends SemanticError {
    private String variableName;
    private String scope;

    public VariableRedefinitionError(String variableName, String scope) {
        super("Variable '" + variableName + "' is already defined in scope '" + scope);
        this.variableName = variableName;
        this.scope = scope;
    }

    @Override
    public void report() {
        System.err.println(getMessage());
    }
}
