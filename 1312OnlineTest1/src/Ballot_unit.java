import java.util.ArrayList;


public class Ballot_unit {

	public Control_unit control_unit;
	public ArrayList<Ballot_slot> ballot_slots;
	
	public Ballot_unit() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void set_ballot_slots(ArrayList<Candidate> candidates)
	{
		ballot_slots=new ArrayList<Ballot_slot>();
		
		for(Candidate o: candidates)
		{
			ballot_slots.add(new Ballot_slot(o));
		}
	}
	
	public void attach(Control_unit control_unit)
	{
		this.control_unit=control_unit;
	}
	
	
	
	

	public Control_unit getControl_unit() {
		return control_unit;
	}
	public void setControl_unit(Control_unit control_unit) {
		this.control_unit = control_unit;
	}

}
