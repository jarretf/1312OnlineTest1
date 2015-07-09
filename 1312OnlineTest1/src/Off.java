

public class Off extends State{

	public Off() {
		// TODO Auto-generated constructor stub
		name="Closed";
	}

	@Override
	public void switch_state(Context_poll_state c) {
		// TODO Auto-generated method stub
		c.setState(new On());
	}
	
}
