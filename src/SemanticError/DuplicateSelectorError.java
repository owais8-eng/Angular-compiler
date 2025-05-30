package SemanticError;

public class DuplicateSelectorError extends SemanticError{
    private String selectorName;
    public DuplicateSelectorError(String selector) {
        super("Semantic Error: Duplicate selector found: " + selector);
    }

    @Override
    public void report() {
        System.err.println(getMessage());
    }
}
