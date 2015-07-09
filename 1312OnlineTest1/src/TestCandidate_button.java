
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TestCandidate_button {
	
	Candidate_button cbtn=new Candidate_button(new Candidate("Mr.X", "Keyboard"));
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(0, cbtn.candidate.polls);
	}

}
