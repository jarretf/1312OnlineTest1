



public abstract class State {
	
	protected String name;
	
	public State() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void switch_state(Context_poll_state c);
}


