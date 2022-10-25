package myProj;

public class ExeptionExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		int a=100;
		String s =null;
		String x="abc";
		int arr[]=new int[5];
		//arr[10]=100;
		
		try
		{
			System.out.println(a/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Entered into catch block");
		}
		
		Thread.sleep(5000);
		try
		{
			System.out.println(s.length());
		}
		catch (NullPointerException e)
		{
			System.out.println("Entered into catch block");
		}
	
		try
		{
			System.out.println(Integer.parseInt(x));
		}
		catch (NumberFormatException e)
		{
			System.out.println("Entered into catch block");
		}
		
		try
		{
			System.out.println(arr[10]=100);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Entered into catch block");
		}
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}

}
