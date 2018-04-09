import java.util.Scanner;

public class Fahrenheit
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double fahrenheit;

		System.out.print("Enter temperature: ");
		double temp = input.nextInt();

		fahrenheit = 9.0/5.0*temp+32;

		System.out.println(temp+" Celsius is "+fahrenheit+" Fahrenheit\n");
		Convert.main(null);
	}
	Index.main(null);
}
