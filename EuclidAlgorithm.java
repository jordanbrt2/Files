package pratice;

public class EuclidAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Highest common factor using While loop
				int a = 25;
				int b = 55;
				
				while (b!=0)
				{
					if (a>b)
					{
						a = a-b;
					}
					else
					{
						b = b-a;
					}
				}
				System.out.println(a);

	}

}
