

public class On extends State{

	public On() {
		// TODO Auto-generated constructor stub
		name="Open";
	}

	@Override
	public void switch_state(Context_poll_state c) {
		// TODO Auto-generated method stub
		c.setState(new Off());
		Printer.polls_status(c.getState());
	}
	
}
