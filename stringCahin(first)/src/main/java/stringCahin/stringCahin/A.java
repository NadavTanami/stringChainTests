package stringCahin.stringCahin;

//מחלקה A
public class A {
    private B next;

    public A(B next) {
        this.next = next;
    }

    public String process(String prefix) {
        if (prefix == null) throw new IllegalArgumentException("Prefix null");
        String updated = prefix + "H";
        return next.process(updated);
    }
}






