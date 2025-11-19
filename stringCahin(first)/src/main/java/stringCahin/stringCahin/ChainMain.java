package stringCahin.stringCahin;



public class ChainMain {

        public String run() {
                E e = new E();
                D d = new D(e);
                C c = new C(d);
                B b = new B(c);
                A a = new A(b);
                return a.process("");
        }
}



