package test;

public class ExceptionExample {
	public static void main(String[] args) {
	
		
		int[]array = {3,4,5};
		//int num=0;
		try 
		{
			//int res=num/0;
		System.out.println(array[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Insde catch block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Done");
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("end");
	}

}
