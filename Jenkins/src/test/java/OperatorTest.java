import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorTest {
Operator obj;
int a;
int b;
	@Before
	public void setUp() throws Exception {
		obj = new Operator();
		a=3;
		b=2;
	}

	@After
	public void tearDown() throws Exception {
	obj= null;
	a=0;
	b=0;
	}
	

	@Test
	public void testMultiply() {
	
		
			assertEquals(6,obj.multiply(a,b));
		
		
	}

}
