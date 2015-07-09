import java.util.ArrayList;


public class Evm {

	public Control_unit control_unit;
	public Ballot_unit ballot_unit;
	public ArrayList<Candidate> candidates;
	
	public Evm() 
	{
		control_unit=new Control_unit();
		ballot_unit=new Ballot_unit();
		this.get_candidate_list();
		control_unit.attach(ballot_unit);
		ballot_unit.attach(control_unit);
		
	}
	
	public void cast_vote(int candidate)
	{
		ballot_unit.ballot_slots.get(candidate).candidate_button.press_button();
	}
	
	
	
	public void generate_result()
	{
		control_unit.generate_result();
	}
	
	public void set_candidates()
	{
		control_unit.setCandidates(candidates);
		ballot_unit.set_ballot_slots(candidates);
	}
	
	public void get_candidate_list()
	{
		candidates=new ArrayList<Candidate>();
		candidates.add(new Candidate("Mr.A", "Chip"));
		candidates.add(new Candidate("Mr.B", "Mouse"));
		candidates.add(new Candidate("Mr.C", "Screen"));
		candidates.add(new Candidate("Mr.D", "Battery"));
	}

}
