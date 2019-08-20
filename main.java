package Tutorial;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input 1st number");
		Scanner sc_1 = new Scanner (System.in);
		int scanned_1 = sc_1.nextInt();
		
		System.out.println("Input 2nd number");
		Scanner sc_2 = new Scanner (System.in);
		int scanned_2 = sc_2.nextInt();
		
		System.out.println("Input 3rd number");
		Scanner sc_3 = new Scanner (System.in);
		int scanned_3 = sc_3.nextInt();
		
		//1st scanned_1
		if ((scanned_1<=scanned_2)&& (scanned_1<=scanned_3)){
			if (scanned_2<=scanned_3) {
				System.out.println(scanned_1);
				System.out.println(scanned_2);
				System.out.println(scanned_3);
			}
			else {
				System.out.println(scanned_1);
				System.out.println(scanned_3);
				System.out.println(scanned_2);
			}
		}
		//1st scanned_2
		if ((scanned_2<=scanned_1) && (scanned_2<=scanned_3)) {
			if (scanned_1<=scanned_3) {
				System.out.println(scanned_2);
				System.out.println(scanned_1);
				System.out.println(scanned_3);
			}
			else {
				System.out.println(scanned_2);
				System.out.println(scanned_3);
				System.out.println(scanned_1);
			}
		}
		//1st scanned_3
		if ((scanned_3<=scanned_1) && (scanned_3<=scanned_2)) {
			if (scanned_2<=scanned_1) {
				System.out.println(scanned_3);
				System.out.println(scanned_2);
				System.out.println(scanned_1);
			}
			else {
				System.out.println(scanned_3);
				System.out.println(scanned_1);
				System.out.println(scanned_2);
			}
		}
		
		}
	
	}


