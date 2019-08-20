// Part of the java.util package 
import java.util.Scanner;

public class StringInputFromUser {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// Getting input from the console 
		System.out.println("Enter your name");
		// Name stored 
		String name = scan.nextLine();

		// Getting input from the console 
		System.out.println("Enter your age");
		// Name stored 	
		String age = scan.nextLine();
		
		// Getting input from the console 
		System.out.println("Enter your email?");
		// Email stored 	
		String email = scan.nextLine();
		
	
		System.out.println ("Your name is " + name);
		System.out.println ("Your age is " + age);
		System.out.println ("Your email is " + email);

	}

}
