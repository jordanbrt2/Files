
public class CodeRunnerPractice {

	public static void main(String[] args) {
		
		boolean x= DoATest (1,2,3,4);
		System.out.println(x);
		
		String a = HelloPerson("Jerry");
		System.out.println(a);
		
		String b = MakeaSequence(4);
		System.out.println(b);
//		
//		DoaCal(a, b, c);
//		
//		Makethissequence(T);
//		

	}
	
	public static boolean DoATest (int a, int b, int x, int z) {
		
		if (( z > x) && (a==b)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String HelloPerson (String Person) {
		
		//return ("Hey there " + Person + "!");
		
		
		   String x = "Hey there " + Person + "!";
		   return x;
	}

		
    public static String MakeaSequence (int A) {
    	
    	
    	if ( A < 1) {
    		return "";
    	}
    	
    	else {
    		
    		int i,j;
    		String theta ="";
   
    		for(i=A;i>=1;i--)
    		{
    			for(j=1;j<=i;++j)
    			{
    				theta+=i;
    			}
    		}
    		return theta;
    	}
		
	}
    
    }
    	
    	
    	
    
    	
    	



