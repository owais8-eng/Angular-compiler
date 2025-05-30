package SemanticError;

public class StyleUrlError extends SemanticError{
    private String styleUrl;

    public StyleUrlError(String styleUrl, int line, int column) {
        super("Invalid 'styleUrls' entry: must end with '.css'. Found: '" + styleUrl);
        this.styleUrl = styleUrl;
    }

    @Override
    public void report() {
        System.err.println(getMessage());
    }
}
