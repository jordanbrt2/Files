// Useful for 2D and 3D Arrays 
public class NestedForLoops {

	public static void main(String[] args) {
		
		String name [] [] = { {"Ben", "John"}, 
				              {"Tom", "Eden"}};
		
		for ( int i = 0; i < 2; i ++) {
			for ( int j = 0; j < 2; j++ ) {
				
				System.out.println (name [i][j]);
			}
		}
		
		}

}
