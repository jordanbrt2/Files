
public class TwoDArrays {

	public static void main(String[] args) {
		// Think of this as a 3x3 box 
		// [ row ] [ column]
		int [] []  ThreeByThree1 = { {1, 2, 3 }, 
				                    {4, 5, 6},
				                    {7, 8, 9 } };
		
		System.out.println(ThreeByThree1[0][0]);
		System.out.println(ThreeByThree1[0][1]);
		System.out.println(ThreeByThree1[0][2]);
		System.out.println(ThreeByThree1[1][0]);
		System.out.println(ThreeByThree1[1][1]);
		System.out.println(ThreeByThree1[1][2]);
		System.out.println(ThreeByThree1[2][0]);
		System.out.println(ThreeByThree1[2][1]);
		System.out.println(ThreeByThree1[2][2]);
		
		// Using a for loop to print instead 
		
		for ( int i = 0; i < 3; i++ ) {
			for ( int j = 0; j < 3; j++ ) {
				System.out.println(ThreeByThree1[i][j]);
			}
		}
		
		// Alternative layout for 3x3 box 
		// Applies to 1D, 2D and 3D arrays
		
		int [] [] ThreeByThree2 = new int [3] [3];
		ThreeByThree2 [0] [0] = 1;
		ThreeByThree2 [0] [1] = 2;
		ThreeByThree2 [0] [2] = 3;
		ThreeByThree2 [1] [0] = 4;
		ThreeByThree2 [1] [1] = 5;
		ThreeByThree2 [1] [2] = 6;
		ThreeByThree2 [2] [0] = 7;
		ThreeByThree2 [2] [1] = 8;
		ThreeByThree2 [2] [2] = 9;
		
		for ( int i = 0; i < 3; i++ ) {
			for ( int j = 0; j < 3; j++ ) {
				System.out.println(ThreeByThree2[i][j]);
			}
		}
		
		// Example of 4x4 box 
		// [ row ] [ column]
		int [] []  FourByFour = { {1, 2, 3, 4 }, 
						          {5, 6, 7, 8},
						          {9, 10, 11, 12 },
						          {13, 14, 15, 16}};
		
		// Rather than list out each one 
		
		for ( int i = 0; i < 4; i++) {
			for ( int j = 0; j < 4; j++) {
				System.out.println(FourByFour[i][j]);
	
			}
		}
		
		/*  This can be expanded to 3D Arrays
		 *  
		 *  Maybe even 4D Arrays
		 */

	}

}
