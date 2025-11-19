package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;
public class systemTest {
	@Test
	public void testFullChain() {
		ChainMain runner = new ChainMain();
		String result = runner.run();
		assertEquals("HELLO", result);
	}
}
