import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringOperatorTest {
	StringOperator obj;
	String word=null;
	@Before
	public void setUp() throws Exception {
		obj = new StringOperator();
		word = "ravita";
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		word = null;
	}

	@Test
	public void testReverseString() {
		assertEquals("ativar",obj.reverseString(word));
	}
	
	@Test
	public void testEncryptName() {
		assertEquals("sbwjub",obj.encryptName(word));
	}

}
