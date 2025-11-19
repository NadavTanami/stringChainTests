package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegrationCDTest {

    @Test
    public void testIntegrationCD() {
        EStub eStub = new EStub();
        D d = new D(eStub);
        C c = new C(d);
        String result = c.process("HE");
        assertEquals("HELL", result);
    }
}
