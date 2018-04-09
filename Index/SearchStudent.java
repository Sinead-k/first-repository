import java.util.Scanner;

public class SearchStudent
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String[][] students =
		{
			{"Mary Reilly", "Software Development", "Year 1", "GMIT"},
			{"Garrett Winters", "Business Studies", "Year 3", "AIT"},
			{"Ashley Cox", "Chemistry", "Year 3", "NUIG"},
			{"Joe Kelly", "Computimg and Digital Media", "Year 2", "GMIT"},
		};
		System.out.print("Enter a search value: ");
  	  	String searchStr = input.nextLine();
   	 	int match = 0;

    	for(int i = 0; i <students.length; i++)
    	{
    		for(int j = 0; j<students[i].length; j++)
    		{
    			if(searchStr.equals(students[i][j]))
    			{
    				match++;
    		    	if(match == 1)
    		    	{
    		    		System.out.println("Name\t\tCollege");
    		    	}
    		    	System.out.println(students[i][0]+"\n"+students[i][3]);
        		}
    		}
		}
		System.out.println();
		System.out.println("Records with match: "+match);
		Index.main(null);
	}
}