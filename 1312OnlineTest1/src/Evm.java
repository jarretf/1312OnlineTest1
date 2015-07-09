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
		
	}
	
	public void set_candidates()
	{
		
	}
	
	public void get_candidate_list()
	{
		candidates=new ArrayList<Candidate>();
		candidates.add(new Candidate("Mr.A", "Keyboard"));
		candidates.add(new Candidate("Mr.B", "Mouse"));
		candidates.add(new Candidate("Mr.C", "Screen"));
		candidates.add(new Candidate("Mr.D", "Battery"));
	}

}
