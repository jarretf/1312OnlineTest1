import java.util.ArrayList;


public class Evm {

	public Control_unit control_unit;
	public Ballot_unit ballot_unit;
	public ArrayList<Candidate> candidates;
	public Context_poll_state polls_state;
	
	public Evm() 
	{
		control_unit=new Control_unit();
		ballot_unit=new Ballot_unit();
		control_unit.attach(ballot_unit);
		ballot_unit.attach(control_unit);
		polls_state=new Context_poll_state();
	}
	
	public void toggle_elections_state()
	{
		polls_state.switch_state();
	}
	
	public boolean cast_vote(int candidate)
	{
		if(polls_state.state_active())
		{
			ballot_unit.ballot_slots.get(candidate).candidate_button.press_button();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public void generate_result()
	{
		control_unit.generate_result();
	}
	
	public void set_candidates_to_evm()
	{
		control_unit.setCandidates(candidates);
		ballot_unit.set_ballot_slots(candidates);
	}
	
	public void set_candidate_list(ArrayList<Candidate> candidates)
	{
		this.candidates=candidates;
	}
	
	
}
