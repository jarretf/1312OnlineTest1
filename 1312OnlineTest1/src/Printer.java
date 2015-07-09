import java.util.ArrayList;


public class Printer {

	public Printer() 
	{
		// TODO Auto-generated constructor stub
	}
	
	

	public static void print_result(ArrayList<Candidate> candidates) {
		// TODO Auto-generated method stub
		System.out.println("NAME\tPARTY\tVOTES");
		for(Candidate c: candidates)
		{
			System.out.println(c.getName()+"\t"+c.getParty()+"\t"+c.getPolls());
		}
		System.out.println();
	}
}
