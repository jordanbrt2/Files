import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class NonRecursiveUserDefinedFunctions {

	public static void main(String[] args) {
		
		// Non-recursive functions/methods
		boolean z = EvenOdd(4);
		System.out.println(z);
		
		String x= ReverseString("The weather today is great");
		System.out.println(x);
		
		boolean y= LeapYear(2000);
		System.out.println(y);
		
		
		int w = DaysInAMonth("January", 2004);
		System.out.println (w);
		
//		long t= DaysAlive("1998, 1, 21");
//		System.out.println(t);
		
		long t = FibonacciSequence(7);
		System.out.println(t);

	}
	
	// a function that returns true if an integer (or long) is even and false if the number is odd. 
	public static boolean EvenOdd (long x) {
		
		if (x%2==0){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// a function that when passed a character string, returns the string in reverse order
    public static String ReverseString ( String reversing) {
    	
    	int i;
		String reversed = "";
		for (i = reversing.length()-1; i>=0; i--)
		{
			reversed = reversed + reversing.charAt(i);  
		}
		return reversed;
		
	}
    
    // a function that returns true if a year is a leap year and false otherwise.
    public static boolean LeapYear (int year) {
    	
    	boolean leap_year;
    	if ((year%4)==0)
		{			
			if ((year%100)==0)
			{
				leap_year = false;
				if ((year%400)==0)
				{
					leap_year = true;
					return leap_year;
				}
				else
				{
					leap_year = false;
					return leap_year;
				}
			}
			else
			{
				return true;
			}
		}
			
		else
		{
			return false;
		}
	}

    	
		
	
    // given a month and year write a program that returns the number of days in that month. 
    public static int DaysInAMonth ( String month, int year) {
    	
switch (month) {
		
		case "January" : return 31; 
			
		case "February" : 
			int days; 
			if ((year%4)==0)
			{			
				if ((year%100)==0)
				{
					days = 28;
					if ((year%400)==0)
					{
						days = 29;
						return days;
					}
					else
					{
						days = 28;
						return days;
					}
				}
				else
				{
					return 29;
				}
			}
				
			else
			{
				return 28;
			}
			
		case "March" : return 31;
			
		case "April" : return 30;
			
		case "May" : return 31;
			
		case "June" : return 30;
			
		case "July" : return 31;
			
		case "August" : return 31;
			
		case "September" : return 30;
			
		case "October" : return 31;
			
		case "November" : return 30;
			
		case "December" : return 31;
				
		default : return 0;
		}
		
	}
    
    // Given a person’s date of birth, how many days have they been alive
    
//    public static long DaysAlive(String dob) 
//	{
//	    long ageInMillis = new Date().getTime() - Date.parse(dob);
//	    long days = ageInMillis / 100 / 60 / 60 / 24;
//	    
//	    return days;
//	}

    
    public static long FibonacciSequence (int n) {
    	if (n == 0)    
		    return 1;    
		 else    
		    return(n * FibonacciSequence(n-1));
    	
		
	}

}
