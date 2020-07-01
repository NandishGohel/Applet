package String;

import java.io.*; 
class stringbuffer { 
	public static void main(String[] args) 
	{ 
		StringBuffer s = new StringBuffer("CoreJava"); 
		int p = s.length(); 
		int q = s.capacity(); 
		System.out.println("Length of string CoreJava=" + p); 
		System.out.println("Capacity of string CoreJava=" + q); 
	} 
} 
