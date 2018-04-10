import java.util.Scanner;

public class Duplicate
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int [] array1 = {1, 2, 3, 4};
		int [] array2 = {1, 11, 13, 4, 15};
		int matches = 0;

		for(int i: array1)
		{
			for(int j: array2)
			{
				if(i == j)
				{
					matches++;
					if(matches == 1)
					{
						System.out.println("Duplicate value(s): ");
					}
					System.out.println(j);
				}
			}
		}
		if(matches == 0)
		{
			System.out.println("No matches found.");
		}
	}
}
