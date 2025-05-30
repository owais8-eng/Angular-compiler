package SemanticError;

public class TemplateUrlError extends SemanticError {
    private String value;

    public TemplateUrlError(String value) {
        super("Invalid 'templateUrl': must end with '.html'. Found: '" + value);
        this.value = value;
    }

    @Override
    public void report() {
        System.err.println(getMessage());
    }
}
