package Basics;

public class MethodOverloading {

	public static void main(String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(3, 3);	
		sum("manish", 25);
	}
	
	public void sum()
	{
		System.out.println("No arguments");	
	}
	
	public static void sum(String name, int age)
	{
		System.out.println(name +" " + age);
	}
	public void sum(int x, int y)
	{
		int z = x+y;
		System.out.println("sum with two arguments " + z);
	}

}
