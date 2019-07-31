package Basics;

public class TwoDArrays {

	public static void main(String[] args) {
		
		String x[][] = new String[2][3];
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		
		System.out.println(x[1][1]);
		//To get the Number of rows in from a 2-dimentional array
		System.out.println("No. of Rows = " + x.length);
		//To get the number of columns from a 2-dimentional array
		System.out.println("No. of Columns = " +x[0].length);
		
		//for loop in 2 dimentional array
		
		for(int row=0; row<x.length; row++){
			for(int col=0; col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
			
		}
		
		
	}

}
