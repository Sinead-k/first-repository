import java.util.Scanner;

public class Sales
{
	public static void main(String[] args)
	{
 		Scanner input = new Scanner(System.in);
 		int productNumber;
 		double total = 0;
 		int quantity;

		System.out.print("Enter product number (1-5 or 0 to stop): ");
		productNumber = input.nextInt();

 		while (productNumber != 0)
 		{

			if(productNumber >= 1 && productNumber <= 5)
			{
				System.out.print("Enter quantity sold: ");
 				quantity = input.nextInt();

 				switch(productNumber)
 				{
					case 1:
						total+= quantity * 2.98;
						break;
					case 2:
						total+= quantity * 4.50;
						break;
					case 3:
						total+= quantity * 9.98;
						break;
					case 4:
						total+= quantity * 4.49;
						break;
					case 5:
						total+= quantity * 6.87;
						break;
				}
			}
			else if(productNumber != 0)
				System.out.print("Product number must be between 1 and 5 included");

				System.out.print("Enter product number (1-5 or 0 to stop): ");
				productNumber = input.nextInt();

		}
		System.out.println("Total of products sold: ");
		System.out.println(Math.round(total*10000.0/10000.0));
	}
}