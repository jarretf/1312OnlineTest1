
public class Candidate_button {

	public Candidate candidate;
	
	public Candidate_button(Candidate candidate) {
		// TODO Auto-generated constructor stub
		this.candidate=candidate;
	}
	
	public void press_button()
	{
		candidate.increment_poll();
	}

}
