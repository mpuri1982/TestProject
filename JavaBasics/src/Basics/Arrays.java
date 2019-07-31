package Basics;

public class Arrays {

	public static void main(String[] args) {
		
		//Declare array of data type int
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
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
		obj[0] = 1;
		obj[1] ="Manish";
		obj[2] = 'M';
		
		for(int p =0; p<obj.length;p++) {
			System.out.println(obj[p]);
		}
		
	}

}
