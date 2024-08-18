package Selenium;
public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		int i = d.getdata();
		System.out.println(i);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getuserdata();	
		getdata2();
		getdata3();
	}

	public int getdata()
	{
	
		System.out.println("Hello world");
		return 1;

	}	

	public static int getdata2()
	{
	
		System.out.println("Hello world");
		return 1;

	}	
	
	public static String getdata3()
	{
	
		System.out.println("Hello world32");
		return "Sudhakar";

	}	
	
	
	
}
