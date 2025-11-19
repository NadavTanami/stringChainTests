package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class DUnitTest {

    @Test
    public void testDWithStub() {
        EStub stub = new EStub();
        D d = new D(stub);
        String result = d.process("HEL");
        assertEquals("HELL", result);
    }
}
