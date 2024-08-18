package Selenium;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		
		//String is an object // string literal 
		
		//String s = "Rahul Shetty Academy";
		//String s1 = "Rahul Shetty Academy";
		
		//String new keyword
		
		String s2 = new String("Welcome");
		String s3 = new String ("Welcome");
		
		String s1 = "Rahul Shetty Academy";
		String[] Splittedstring = s1.split("Shetty");
		System.out.println(Splittedstring[0]);
		System.out.println(Splittedstring[1]);
		//System.out.println(Splittedstring[2]);
		
		System.out.println(Splittedstring[1].trim());
	
		for(int i=s1.length()-1;i>=0 ;i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		
	}

}
