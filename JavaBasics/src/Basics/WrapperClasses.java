package Basics;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		//Normal printing of string 
		String s = "ABC";
		System.out.println(s);
		
		//Converting string into integer using parsing 
		String s1 = "100";
		int i = Integer.parseInt(s1);
		System.out.println(i+100);
		
		//Converting int to String
		int k = 100;
		String j = String.valueOf(k);
		System.out.println("The value of j is " +j);
		
		//
		String t ="100";
		System.out.println("String is:" + t+20);
		int y = Integer.parseInt(t);	
		System.out.println(y+20);
		
		String q = "200";
		double d = Double.parseDouble(q);		
		System.out.println(d+20.23);
		
	
		
		
	}

}
