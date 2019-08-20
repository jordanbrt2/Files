/*
 As a note, the null keyword is used to indicate that an object
 is not pointing to anything. It is rather like declaring an
 integer that contains zero or a string that
 contains no characters ("").
 */

import javax.swing.JOptionPane; // Creates a message box that pauses the program

import java.util.ArrayList;

public class ArraysLabs {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Click OK to continue...");
		
		Data Fred = new Data ("Fred", 41);
		Data Jo = new Data ("Jo", 43);
		Data Zoe = new Data("Zoe", 37);
		Data Harry = new Data("Harry", 78);
		
		ArrayList<Data> array_list = new ArrayList<Data>();
		array_list.add(Fred);
		array_list.add(Zoe);
		array_list.add(Harry);
		array_list.add(Jo);
		//PrintDataArray(array_list);
		
		//Casting ();
		
//		ArrayList<Data> ArrayA = new ArrayList<Data>();
//		ArrayA.add(Fred);
//		ArrayA.add(Zoe);
//		ArrayA.add(Harry);
//		ArrayA.add(Jo);
//		
//		ArrayList<Data> ArrayB = new ArrayList<Data>();
//		
//		PrintDataArray(ArrayA);
//		System.out.println();
//		ArrayB = ArrayA;
//		PrintDataArray(ArrayB);
//		System.out.println();
//		ArrayA.remove(1);  // index 1 has been removed
//		PrintDataArray(ArrayB);
		
		ArrayList<Data> ArrayC = new ArrayList<Data>();
		ArrayC.add(Fred);
		ArrayC.add(Zoe);
		ArrayC.add(Harry);
		ArrayC.add(Jo);
		
		ArrayList<Data> ArrayD = new ArrayList<Data>();
		PrintDataArray(ArrayC);
		System.out.println();
		ArrayD = (ArrayList<Data>)ArrayC.clone();
		ArrayC.remove(1);
		PrintDataArray(ArrayC);
		System.out.println();	
		PrintDataArray(ArrayD);
		System.out.println();

		

	}

	public static void Casting() {
		double x = 10.3;
		int y = (int) x;
		System.out.println(y);
		
	}

	private static void PrintDataArray(ArrayList<Data> array_list) {
		for(int i=0;i<array_list.size();++i)
		{
			array_list.get(i).Print();
		}
	}
	
	// To print 2D array
	private static void PrintArray(int[][] array) 
	{
		for(int i=0;i<array.length;++i)
		{
			for(int j=0;j<array[i].length;++j)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
		
	}
	
	
