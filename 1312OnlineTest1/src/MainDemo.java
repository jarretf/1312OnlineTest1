import java.util.ArrayList;


public class MainDemo 
{

	public static void main(String args[])
	{
		Evm evm=new Evm();
		evm.set_candidates_to_evm();
		
		evm.generate_result();
		
		evm.cast_vote(0);
		evm.cast_vote(2);
		evm.cast_vote(1);
		evm.cast_vote(0);
		evm.cast_vote(0);
		
		evm.toggle_elections_state();
		
		evm.generate_result();
		
	}
	
	

}
