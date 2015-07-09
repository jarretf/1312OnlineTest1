
public class Ballot_slot {
	
	public Candidate candidate;
	public boolean candidate_lamp=false;
	
	public Ballot_slot(Candidate candidate) 
	{
		this.candidate = candidate;
	}
	
	public int toggle_candidate_lamp()
	{
		if(candidate_lamp==true)
		{
			candidate_lamp=false;
			return 0;
		}
		else
		{
			candidate_lamp=true;
			return 0;
		}
	}
}
