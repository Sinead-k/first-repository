import java.util.Scanner;

public class ContinueTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
   		int number;

   		System.out.print("Enter a number from 1 to 10: ");
   		number = input.nextInt();

   		for (int counter = 1; counter <= 10; counter++)
   		{
   			if(counter != number)

   			System.out.println(counter);
   		}
   		System.out.println("\nUsed continue to skip printing " +number);
	}
}

