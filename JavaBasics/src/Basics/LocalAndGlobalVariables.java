package Basics;

public class LocalAndGlobalVariables {

	String name = "Manish";
	static int age = 25;
	public static void main(String[] args) {
		
		int i=10;
		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		System.out.println(i);
		System.out.println("Age is : " +age);
		obj.sum(2,3);
	}
	
	public void sum(int x, int y)
	{
		int z = x+y;
		System.out.println("The sum of two numbers " + x + " and " + y + " is : " + z);
	}

}
