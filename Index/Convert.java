import java.util.Scanner;

public class Convert
{
	public static void main(String[] args)
	{
				Scanner input = new Scanner(System.in);

				System.out.println("1. Fahrenheit to Celsius");
				System.out.println("2. Celsius to Fahrenheit");
				System.out.println("3. Exit");

				System.out.print("Choice: ");
				int choice = input.nextInt();

   				switch(choice)
   				{
				case 1:
						System.out.println("");
				        Celsius.main(null);
       					break;
       			case 2:
						System.out.println("");
						Fahrenheit.main(null);
       					break;
       			case 3:
						System.out.println("Exiting....");
        				break;
				}
	}
}