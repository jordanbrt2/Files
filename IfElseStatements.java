import java.util.Scanner;

// Practice If else statements with user input

// Tell you if you have passed or failed

// This could be expanded on to model the grading system at uni

public class IfElseStatements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// Get grade input from console
		System.out.println("Enter the grade");
		
		// Store grade input using a int method 
		
		int  grade = scan.nextInt();
		System.out.println(grade);
		
		if ( grade >= 40) {
			System.out.println("You have passed the module");
			
		}
		else {
			System.out.println("You have not passed the module");
		}
		
		
		
		
		
		

	}

}
