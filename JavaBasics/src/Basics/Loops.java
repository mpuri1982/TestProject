package Basics;

public class Loops {

	public static void main(String[] args) {
		// while loop
		int i=1;
		while(i<3)
		{
			System.out.println(i);
			i=i+1;
		}
		
		//for loop
		for(int j=0; j<=5; j++)
		{
			System.out.println(j);
		}
		
		//Advanced for loop
		int j[] = new int[3];
		j[0] = 2;
		j[1] = 5;
		j[2] = 9;
		//int total=0;
		for(int x : j)
		{
			//total+=x;
			System.out.println("Printing all the value of array as: " + x);
		}
		//System.out.println("Printing value of total " + total);
	}

}
