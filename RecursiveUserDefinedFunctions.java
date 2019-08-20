
public class RecursiveUserDefinedFunctions {
	
	
	public static void main(String[] args) {
		int a= Factorial(2);
		System.out.println(a);
		
		int b= Fibonacci(2);
		System.out.println(b);
	}
	
	// Factorial 
	public static int Factorial(int n) { 
		  if(n == 1) 
		  { 
		    return n; 
		  } 
		  else 
		  { 
		    return n * Factorial(n-1); 
		  } 
		  

}
	
	// Fibonacci
	
	public static int Fibonacci(int n) { 
		  if(n <= 1) 
		  { 
		    return n; 
		  } 
		  else 
		  { 
		    return  Fibonacci(n-2) + Fibonacci(n-1); 
		  } 
		} 
	
}
