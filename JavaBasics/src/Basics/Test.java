package Basics;

public class Test extends Parent {
	static int a;
	int b=5;
	
	public Test()
	{
		super();
		System.out.println("This is constructor");
	}
	
	public static void main(String[] args) {
		int a=4;
		Test test = new Test();
		//Parent parent =  new Parent();
		//parent.test2();
		Parent.test1();
		//test.test123();
		System.out.println("main method value of a:" + a);
	}
	
	public void test123()
	{
		System.out.println(a);
		System.out.println(b);
	}

}

