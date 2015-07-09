
public class MainDemo 
{

	public static void main(String args[])
	{
		Evm evm=new Evm();
		evm.set_candidates();
		evm.generate_result();
		evm.cast_vote(0);
		evm.generate_result();
	}
	
	

}
