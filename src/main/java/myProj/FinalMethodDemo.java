package myProj;


	
	class Bike
	{
		void run()
		{
			System.out.println("Running...");
		}
	}
	
	class Honda extends Bike
	{
		void run()
		{
			System.out.println("Started...");
		}
	}


	public class FinalMethodDemo 
	{
	public static void main(String[] args)
	{
		Bike h=new Bike();
		h.run();
	}
	}
