package Basics;

public class OopsConcepts {

	public static void main(String[] args) {
		OopsConcepts obj = new OopsConcepts();
		obj.print();
		int p = obj.addition();
		System.out.println("sum of two numbers " + p);
		int k = obj.multiply(2, 2);
		System.out.println("Multiplication of two numbers " + k);
		
	}
		
		public void print()
		{
		System.out.println("This is test");	
		}
		public int addition()
		{
			int a=1;
			int b=2;
			int c=a+b;
			return c;
		}
		public int multiply(int x, int y)
		{
			int z= x*y;
			return z;
		
		}
	}

