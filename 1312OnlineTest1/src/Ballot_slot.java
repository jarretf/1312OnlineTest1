
public class Ballot_slot {
	
	public Candidate candidate;
	public Candidate_button candidate_button;
	
	public Ballot_slot(Candidate candidate) 
	{
		this.candidate = candidate;
		this.candidate_button=new Candidate_button(candidate);
	}
	
	
}
