
public class ForLoopSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// For loops
		
		// Sequence starts at 4 and goes up by 1 until reach 11
		for (int i = 4; i < 12; i++) {
			  System.out.println(i);
			}
		
		// Sequence starts at 10 and goes up 3 until reach 19
		for (int i = 10; i < 20; i = i +3 ) {
			  System.out.println(i);
			}
		
		// Sequence starts at 1 and goes up 3 until reach 16
		for (int i = 1; i < 17; i = i +3 ) {
			  System.out.println(i);
			}
		
		// Sequence 2,4,6,8,10,12
		for (int i = 2; i < 13; i = i + 2 ) {
			  System.out.println(i);
			}

       // Sequence 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
       for (int i = 1; i < 11; i++ ) {
    	   System.out.println(i*i);
	       }

       // Sequence -10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10
      for (int i = -10; i <= 10; i = i + 2 ) {
	      System.out.println(i);
           }
      
   // Sequence -20, -15, -10, -5, 5, 10, 15, 20
      for (int i = -20; i <= -5; i = i + 5 ) {
	      System.out.println(i);
           }
      for (int j = 5; j <= 20; j = j + 5 ) {
    	  System.out.println(j);
      }

	}

}
