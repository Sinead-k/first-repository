import java.util.Scanner;

public class EnhancedFor
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int [] x = {7, 6, 11, 15, 19};
		int total = 0;

		for(int number : x)
		{
			total += number;
		}
		System.out.println("Sum of array values is: "+total);
		Index.main(null);
	}
}
