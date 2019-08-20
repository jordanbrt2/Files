import java.text.DecimalFormat;

public class Resources1 {

	public static void main(String[] args) {

		/*Q1
		 * Take a variable x of type double and value 1.2345
		 * 
		 * Use a decimal format function to return variable x to 2.d.p 
		 *
		 */
		
		Q1(1.2345);
		

	}
	
	public static String Q1(double x) {
		
		DecimalFormat number_format = new DecimalFormat("#.##");
		System.out.println(x);
		String formatted_string = number_format.format(x);
		System.out.println(formatted_string);
		return x;
		
	}

}
