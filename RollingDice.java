// imports a built-in function
import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		
		Random num = new Random();
		int result = num.nextInt(6) + 1; // + 1 because index starts at 0
		System.out.println("The number is " + result); // space needed between is and "
		
		// 6 in line 9 can be changed to any integer 

	}

}
