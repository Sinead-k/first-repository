/*DOG
-name: String
<<constructor>> DOG (name:String)
+getName():String
+speak():String//
import java.util.Scanner;*/

/*Labrador
<<contructor>> Labrador (name:String)*/

/*Yorkshire
<<contructor>> Yorkshire (name:String)
+speak():String*/

public class Dog
{
	private String name;
	
	public Dog(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public String speak()
	{
		return "woof";
	}
	
}