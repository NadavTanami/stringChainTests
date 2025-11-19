package stringCahin.stringCahin;

public class BStub extends B {
    public BStub() { super(null); }

    @Override
    public String process(String prefix) {
        return prefix; // מחזיר את הקלט לבדיקה של A
    }
}
