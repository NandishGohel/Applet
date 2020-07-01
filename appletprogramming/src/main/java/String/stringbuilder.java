package String;


import java.lang.*; 

public class stringbuilder { 

	public static void main(String[] args) 
	{ 

		StringBuilder sb1 = new
					StringBuilder("Core Java "); 
		System.out.println("Input: " + sb1); 

		
		sb1.append(true); 
		System.out.println("Output: " + sb1); 

		System.out.println(); 

		StringBuilder sb2 = new StringBuilder("We fail- "); 
		System.out.println("Input: " + sb2); 

		
		sb2.append(false); 
		System.out.println("Output: " + sb2); 
	} 
} 
