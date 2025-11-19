package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class CUnitTest {

    @Test
    public void testCWithStub() {
        DStub stub = new DStub();
        C c = new C(stub);
        String result = c.process("HE");
        assertEquals("HEL", result);
    }

    @Test
    public void testCWithWrongStub() {
        DStubWrong stub = new DStubWrong();
        C c = new C(stub);
        String result = c.process("HE");
        assertEquals("HE-X", result);
    }
}