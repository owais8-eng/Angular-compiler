package SemanticError;

public class FunctionReturnTypeMismatchError extends SemanticError {
    private String functionName;
    private String declaredType;
    private String actualType;
    public FunctionReturnTypeMismatchError(String functionName, String declaredType, String actualType) {
        super("Function '" + functionName + "' return type mismatch: declared '" + declaredType + "', but got '" + actualType);
        this.functionName = functionName;
        this.declaredType = declaredType;
        this.actualType = actualType;
    }

    @Override
    public void report() {
        System.err.println(getMessage());
    }
}
