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

public class Maths extends Subject
{
	public Maths(String name)
	{
		super(name);
	}
}