import java.util.Scanner;

public class Average
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int [] x = {2, 3, 4, 7};

		Average a = new Average ();
		System.out.println("Average value is: "+a.average(x));
	}
	public int average(int[] x)
	{
		int total = 0;
		for(int i: x)
		{
			total += i;
		}
		return total/(x.length);
	}
}