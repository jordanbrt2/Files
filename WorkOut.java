import java.text.DecimalFormat;

public class WorkOut {

	public static void main(String[] args) {
		
		String a =Question1(1.2345);
		System.out.println(a);
		

	}
	
	public static String Question1 (double x) {
		
		DecimalFormat number_format = new DecimalFormat("#.##");
		String formatted_string = number_format.format(x);
		return formatted_string;
	
		
	}

}
