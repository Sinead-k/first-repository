import java.util.Scanner;

public class Celsius
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double celsius;

		System.out.print("Enter temperature: ");
		double temp = input.nextInt();

		celsius = 5.0/9.0*(temp - 32);

		System.out.println(temp+" Fahrenheit is "+celsius+" Celsius\n");
		Convert.main(null);
	}
}