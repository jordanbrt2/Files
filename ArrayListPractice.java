// Import a built-in function
import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		// Set up of 1D Array using alternative layout
		String [] Colours = new String [3];
		Colours [0] = "Blue";
		Colours [1] = "Red";
		Colours [2] = "Yellow";
		System.out.println(Colours[2]);
		
		// Using ArrayList
		
		/*
		 *  Note do not name class "ArrayList"
		 *   
		 *  Will not be able to import in line 2
		 *  
		 *  To change name of Class
		 *  
		 *  Right Click on the want change class in folder
		 *  
		 *  Select "Refactor" then "Rename"
		 */
		
		// ArrayList are more flexible than Arrays
		// Arrays static size, ArrayList dynamic size
		
		
		ArrayList ColoursList = new ArrayList ();
		ColoursList.add("Blue");
		ColoursList.add("Red");
		ColoursList.add("Yellow");
		System.out.println(ColoursList);
		
		/*
		 * Additional built in functions with ArrayList
		 *
		 * ColoursList.<something> "A long list will appear
		 * 
		 * These functions only come with ArrayList 
		 * 
		 */
		
		
		// Removes index from array
		ColoursList.remove("Blue");
		
		// Searching insides array and prints True or False 
		ColoursList.contains("Yellow");
		
		// Example removing Red from ArrayList
		
		ArrayList ColoursList2 = new ArrayList ();
		ColoursList2.add("Yellow");
		ColoursList2.add("Red");
		ColoursList2.add("Green");
		ColoursList2.remove("Red");
		System.out.println(ColoursList2);
		
	    // Example searching for Yellow in ArrayList
		
		ArrayList ColoursList3 = new ArrayList ();
		ColoursList3.add("Yellow");
		ColoursList3.add("Red");
		ColoursList3.add("Green");
		System.out.println(ColoursList3.contains("Yellow"));
			

	}

}
