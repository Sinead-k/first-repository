import java.util.Scanner;

public class FourthArray
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int [] x = {7, 6, 11, 15, 19};
		int total = 0;

		for(int counter = 0; counter < x.length; counter++)
		{
			total+= x[counter];
		}
		System.out.println("Sum of array values is: "+total);
	}
}
