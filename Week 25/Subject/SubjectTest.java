public class SubjectTest
{
	public static void main (String[] args)
	{
		SoftwareDevelopment sd = new SoftwareDevelopment("Software Development");
		System.out.println(sd.getName()+" is worth "+sd.credits()+" credits.");

		Maths maths = new Maths("Maths");
		System.out.println(maths.getName()+" is worth "+maths.credits()+" credits.");
	}
}