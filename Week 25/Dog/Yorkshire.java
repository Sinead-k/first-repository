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

public class Yorkshire extends Dog
{
	public Yorkshire(String name)
	{
		super(name);
	}
	public String speak()
	{
		return "arg arg";
	}
}