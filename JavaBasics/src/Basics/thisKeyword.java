package Basics;

public class thisKeyword {
	
	String name;
	int age;
	
	public thisKeyword(String name, int age)
	{
		this.name= name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		thisKeyword key = new thisKeyword("Tom", 22);
	}
	

}
