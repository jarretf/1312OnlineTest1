
public class Candidate {
	
	public String name;
	public String party;
	public int polls=0;
	
	public Candidate(String name, String party) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.party=party;
	}
	
	public void increment_poll()
	{
		this.polls+=1;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getPolls() {
		return polls;
	}

	public void setPolls(int polls) {
		this.polls = polls;
	}
	
	

}
