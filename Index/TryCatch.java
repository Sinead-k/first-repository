import java.util.Scanner;

public class TryCatch
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] x = {7,6,11,15,19};

		for(int counter = 0; counter < x.length; counter++)
		{
				try{
						System.out.println("Value stored in index 5 is: "+x[5]);
				   }
					catch(ArrayIndexOutOfBoundsException e){
							System.out.println(e);
							System.out.printf("responses[%d] = %d%n%n",counter, x[counter]);
															 }
		}
		System.out.println("End of Program");
		Index.main(null);
	}
}