import java.util.Scanner;

public class SearchStudent
{
	public static void main(String[] args)
	{
				Scanner input = new Scanner(System.in);
				String [][] students = 
				{
					{"Mary Reilly", "Software Development", "Year 1", "GMIT"},
					{"Garrett Winters","Business Studies","Year 3","AIT"},
					{"Ashley Cox","Chemistry","Year 3","NUIG"},
					{"Joe Kelly","Computing and Digital Media","Year 2","GMIT"}
				};

				System.out.println("Please enter a search value: ");
				String value = input.next();
