// System Commands downwards be careful

import java.text.DecimalFormat;

public class BuiltInFunctions {

	public static void main(String args[])
	{
		Strings ();
		ReverseString();
		RoundingTest(10.2);
		RoundingTest(-100.1);
		RoundingTest(-100.49);
		
		
		
		
	}
	
	public static void Strings (){
		
		double number = 1.0/3.0, x = 123.456, y = 17.0/3.0, z = Math.pow(2, 1.0/2.0);
		
		
		DecimalFormat number_format = new DecimalFormat("#.##");
		System.out.println(number);
		String formatted_string = number_format.format(number);
		System.out.println(formatted_string);
		
		
		DecimalFormat number_format2 = new DecimalFormat("#.###");
		String formatted_string2 = number_format2.format(y);
		System.out.println(formatted_string2);
		
//		// Digits before the decimal point for x
//		
//		String x_String = String.valueOf(x);
//		String x_beforePoint = x_String.substring(0, x_String.indexOf("."));
//		System.out.println("digits before point for x = " + x_beforePoint.length());
//		
//		// Digits before the decimal point for y
//		
//		String y_String = String.valueOf(y);
//		String y_beforePoint = y_String.substring(0, y_String.indexOf("."));
//		System.out.println("digits before point for y = " + y_beforePoint.length());
//		
//		// Digits before the decimal point for z
//		
//		String z_String = String.valueOf(z);
//		String z_beforePoint = z_String.substring(0, z_String.indexOf("."));
//		System.out.println("digits before point for z = " + z_beforePoint.length());
		
		// Digits after the decimal point for x [ Look into this] 
		
//		String x_String = String.valueOf(x);
//		String x_beforePoint = x_String.substring(x_String.indexOf("."), 1 );		
//		System.out.println("digits before point for x = " + x_beforePoint.length());
	}
	
	 // Reverse a String concatenated with another b with a space between them
	public static void ReverseString (){
		
		String a = "Hello", b = "World";
		
		String c = "";
		for (int i=a.length()-1; i>=0; i=i-1)
				{
					c = c + a.charAt(i);
				}
		System.out.println("a in reverse plus b = " + c + " " + b);
		
		System.out.println("\n");
		
	  // Search for the substring ‘ll’ in c and replace it for ‘ppp’
		String c_replaced  = c.replace("ll", "ppp");
		System.out.println(c_replaced);

	}
	
	// Mathematical Functions/ Java Math Library 
	
	// Use class method format 
	
	// ceil, floor, round 
	private static void RoundingTest(double x) {
		
		String ceil = String.valueOf(Math.ceil(x));
		String floor = String.valueOf(Math.floor(x));
		String round = String.valueOf(Math.round(x));
		
		System.out.println("For " + x + " ceil=" + ceil + " floor=" + floor + " round=" + round);

	
	}

	
	
	
   
	 
	


}
