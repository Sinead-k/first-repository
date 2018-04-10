//Instance testing

public class DogTest
{
	public static void main (String[] args)
	{
		//Dog dog = new Dog("Rover");
		//System.out.println(dog.getName()+" the dog says "+dog.speak());

		Labrador labrador = new Labrador ("Goldie");
		System.out.println(labrador.getName()+" the labrador says "+labrador.speak());

		Yorkshire yorkshire = new Yorkshire ("Rusty");
		System.out.println(yorkshire.getName()+" the yorkshire says "+yorkshire.speak());
	}
}