package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegrationABTest {

    @Test
    public void testIntegrationAB() {
        CStub cStub = new CStub();
        B b = new B(cStub);
        A a = new A(b);
        String result = a.process("");
        assertEquals("HE", result.substring(0,2));
    }
}
