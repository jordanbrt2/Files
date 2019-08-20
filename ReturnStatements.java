// Return statement happen inside methods 

/*
 *  Return statement allow you to run a method 
 * 
 *  And store the result of a method in a variable 
 *  
 *  public static void 
 *  
 *  "void" a type of return 
 *  
 *  void = nothing stored in code 
 *  
 */
public class ReturnStatements {
	
    // This is the main method 
	public static void main(String[] args) {
		print();
		// addition (1,2 ) same as 1 +3 
		int store = addition(1,2);
		System.out.println(store);
		
		String UpperCase = names("Jordan");
		System.out.println(UpperCase);
		
		int [] SomeArray2 = SomeArray1(1,2,3);
		System.out.println(SomeArray2[0]);
		System.out.println(SomeArray2[1]);
		System.out.println(SomeArray2[2]);
		
		int [] SomeArray4 =SomeArray3(4,5,6);
		System.out.println(SomeArray4[0]);
		System.out.println(SomeArray4[1]);
		System.out.println(SomeArray4[2]);
		
		int [] [] SomeArray6 =SomeArray5 (10,11,12,13,14,15);
		System.out.println(SomeArray6[0][0]);
		System.out.println(SomeArray6[0][1]);
		System.out.println(SomeArray6[0][2]);		
		System.out.println(SomeArray6[1][0]);
		System.out.println(SomeArray6[1][1]);
		System.out.println(SomeArray6[1][2]);
		
	}
	
	public static void print () {
		System.out.println("Hello");
	}
	
	public static int addition (int a, int b) {
				return a + b;
	}
	
	public static String names ( String name) {
		return name.toUpperCase();	
		
	
	}
	
	/*
	 *  If no variables inside method 
	 * 
	 *  Will return null 
	 * 
	 */
	
	// Using a 1D Array
	
	public static int [] SomeArray1 ( int a, int b, int c) {
		int [] array = new int [3];
		array[0] =a;
		array[1] =b;
		array[2] =c;
		return array;

	}
	
	// Alternative 1D Array layout 
	public static int [] SomeArray3 (int a, int b, int c ) {
		int [] array = { a,b,c}; 
		return array;
	}
	
	// Example using 2D Array
	public static int [] [] SomeArray5 ( int a, int b, int c, int d, int e, int f) {
		int [] [] array = { {a,b,c}, 
				            {d,e,f}};
		return array;
		}
	}
	



