package Antlr;

import java.util.HashSet;
import java.util.Set;

public class ErrorSet {
    private Set<String> values = new HashSet<>();

    public void addVal(String val) {
        values.add(val);
    }

    // للتحقق إذا كانت هناك أخطاء
    public boolean isEmpty() {
        return values.isEmpty();
    }

    // للحصول على كل الأخطاء
    public Set<String> getValues() {
        return values;
    }

    // لإعادة تهيئة المجموعة (اختياري)
    public void addSet() {
        values = new HashSet<>();
    }
}
