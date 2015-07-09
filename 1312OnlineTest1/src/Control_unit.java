import java.util.ArrayList;


public class Control_unit {
	
	public int total_candidates;
	public int total_polls=0;
	public boolean can_vote=false;
	public Ballot_unit ballot_unit;
	
	
	
	public Control_unit() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	public void allow_vote()
	{
		can_vote=true;
	}
	
	
	public void attach(Ballot_unit ballot_unit)
	{
		this.ballot_unit=ballot_unit;
	}

	public Ballot_unit getBallot_unit() {
		return ballot_unit;
	}

	public void setBallot_unit(Ballot_unit ballot_unit) {
		this.ballot_unit = ballot_unit;
	}

}
