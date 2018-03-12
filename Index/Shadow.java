import java.util.Scanner;

public class Shadow
{
	int x = 1;

	public static void main(String[] args)
	{

		Shadow s = new Shadow();
		Index.main(null);

		System.out.println("Local x = "+s.localVar());
		System.out.println("Global x from method = "+s.globalVar());
		System.out.println("Global x from attribute = "+s.x);
	}

		public int globalVar()
		{
			return x;
		}

		public int localVar()
		{
			int x = 2;
			return x;
		}
}
