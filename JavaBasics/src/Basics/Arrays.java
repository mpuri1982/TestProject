package Basics;

public class Arrays {

	public static void main(String[] args) {
		
		//Declare array of data type int
		
		//int i[] =new int[5];
		
		int arr[] = new int[4];
		//int arry1[][] = new int[2][1];
		
	
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		//To print a single value from the array
		System.out.println("Print" + arr[1]);
		
		//To print all the values of array
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Array : " + arr[i]);
		}
		
		//To reverse print an array
		for(int j=arr.length; j>0; j--)
		{
				System.out.println("In reverse : " + arr[j-1]);
		}
		
		//object arrays
		Object obj[] = new Object[3];
		//Object obj1[] = new Object[2];
		obj[0] = 1;
		obj[1] ="Manish";
		obj[2] = 'M';
		
		System.out.println("Length of array " + obj.length);
		//Array index out of bound exception
		//System.out.println(obj[4]);
		for(int p =0; p<obj.length;p++) {
			System.out.println(obj[p]);
		}
		
	}

}
