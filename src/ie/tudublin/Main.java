package ie.tudublin;

//changes on the test branch


public class Main
{
	public static void main(String[] args)
	{
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		
		for(String s:args)
		{
			System.out.println(s);
		}
	}
}