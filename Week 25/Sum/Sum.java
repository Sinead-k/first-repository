import java.util.Scanner;

public class Sum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer value: ");
		int x = input.nextInt();
		System.out.print("Enter another integer value: ");
		int y = input.nextInt();

		System.out.println(x+" + "+y+" = "+sum(x,y));

		System.out.print("Enter a third integer value: ");
		int z = input.nextInt();

		System.out.println(x+" + "+y+" + "+z+" = "+sum(x,y,z));
	}
	public static int sum(int... values)
	{
		int total = 0;
		for(int i: values)
		{
			total += i;
		}
		return total;
	}
}