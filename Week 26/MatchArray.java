import java.util.Scanner;

public class MatchArray
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] x = {1,2,3,4,5};

		System.out.print("Enter a value: ");
		int y = input.nextInt();

		int z = 0;

		for(int i: x)
		{
			if(i==y)
			{
				z = 1;
				System.out.println("Match found.");
				break;
			}
		}
		if(z==0)
		{
			System.out.println("No match found.");
		}
	}
}