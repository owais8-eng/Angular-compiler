package SemanticError;

import javax.xml.transform.sax.SAXResult;

public abstract class SemanticError {

    protected String message;

    public SemanticError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract void report();
}
