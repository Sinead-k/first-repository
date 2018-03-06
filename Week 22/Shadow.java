import java.util.Scanner;

public class Shadow
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int globalx = 0;
		int localx = 2;

		globalVar();

		public void globalVar()
		{
			System.out.println("Global x from method = "+globalx);

			localVar();
		}

		public void localVar()
		{
			System.out.println("Local x = "+localx);
		}
	}
}
