package stringCahin.stringCahin;

public class DStubWrong extends D {
    public DStubWrong() { super(null); }

    @Override
    public String process(String prefix) {
        return prefix + "-X"; // מחזיר ערך שגוי עבור בדיקה שלילית
    }
}
