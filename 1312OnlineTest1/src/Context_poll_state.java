


public class Context_poll_state 
{

	private State state;
	public Context_poll_state() 
	{
		// TODO Auto-generated constructor stub
		state=new On();
	}
	
	public void switch_state()
	{
		state.switch_state(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public boolean state_active()
	{
		if(state instanceof Off)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
