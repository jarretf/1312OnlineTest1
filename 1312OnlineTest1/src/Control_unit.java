import java.util.ArrayList;


public class Control_unit {
	
	public int total_candidates;
	public int total_polls=0;
	public Ballot_unit ballot_unit;
	public ArrayList<Candidate> candidates;
	
	
	public Control_unit() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public void attach(Ballot_unit ballot_unit)
	{
		this.ballot_unit=ballot_unit;
	}
	
	public void generate_result()
	{
		System.out.println("NAME\tPARTY\tVOTES");
		for(Candidate c: candidates)
		{
			System.out.println(c.getName()+"\t"+c.getParty()+"\t"+c.getPolls());
		}
		System.out.println();
	}

	
	
	
	

	public int getTotal_candidates() {
		return total_candidates;
	}
	public void setTotal_candidates(int total_candidates) {
		this.total_candidates = total_candidates;
	}

	public int getTotal_polls() {
		return total_polls;
	}
	public void setTotal_polls(int total_polls) {
		this.total_polls = total_polls;
	}
	
	public Ballot_unit getBallot_unit() {
		return ballot_unit;
	}
	public void setBallot_unit(Ballot_unit ballot_unit) {
		this.ballot_unit = ballot_unit;
	}

	public ArrayList<Candidate> getCandidates() {
		return candidates;
	}
	public void setCandidates(ArrayList<Candidate> candidates) {
		this.candidates = candidates;
	}

	
}
