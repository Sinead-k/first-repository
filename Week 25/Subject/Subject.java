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

public class Subject
{
	private String name;

	public Subject(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public int credits()
	{
		return 5;
	}
}