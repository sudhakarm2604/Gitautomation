package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		
//		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
//		
//
//		for(int i = 0; i<arr2.length ; i++)
//		{
//			if (arr2[i] % 2==0  )
//				
//			{
//				System.out.println(arr2[i]);
//				break;
//				}
//			else 
//			{
//				System.out.println(arr2[i]+ "is not multiple of 2");
//			}
//			
			//ArrayList
			
		List a = new ArrayList();
		a.add("Sudhakar");
		a.add("Learning");
		a.add("Selenium");
		a.add("on");
		a.add("Udemy");
	
		System.out.println(a.get(1));
		
	//array for loop
		
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));	
		}
				
		System.out.println("************");
          
		//enhanced for loop
		
		
		//for( String val: a )	
		{
		
	//	System.out.println(val);
		
		}
		
		//item is present in the arraylist
		
		System.out.println(a.contains("Sudhakar"));
		String[] name = {"Sudhakar","selenium","Automation"};
		
		// convert normal arrays to arralist
		List <String> nameArrayList = Arrays.asList(name);
		
		//item is present in the arraylist
		nameArrayList.contains("Selenium");
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
