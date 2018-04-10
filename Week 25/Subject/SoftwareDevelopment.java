/*Subject
-name:String
<<contructor>> Subject(name:String)
+getName():String
+credits():int*/

/*Software Development
<<constructor>> Software Development(name:String)
+credits():int*/

/*Maths
<<constructor>> Maths(name:String)*/

public class SoftwareDevelopment extends Subject
{
	public SoftwareDevelopment(String name)
	{
		super(name);
	}

	public int credits()
	{
		return 10;
	}
}