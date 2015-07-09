import static org.junit.Assert.*;

import org.junit.Test;


public class TestContext_poll_state {

	Context_poll_state cps= new Context_poll_state();
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(true, cps.state_active());
	}

}
