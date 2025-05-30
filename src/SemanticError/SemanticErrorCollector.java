package SemanticError;

import Antlr.SemanticCheck;

import java.util.ArrayList;
import java.util.List;

public class SemanticErrorCollector {
    private List<SemanticError> errors = new ArrayList<>();

    public void add(SemanticError error) {
        errors.add(error);
    }
    public boolean hasError() {
        return !errors.isEmpty();
    }

    public void reportAll() {
        for (SemanticError error : errors) {
            error.report();
        }
    }

    public List<SemanticError> getErrors(){
        return errors;
    }
}