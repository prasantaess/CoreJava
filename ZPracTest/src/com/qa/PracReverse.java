package com.qa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class myclass{
	
	private static myclass cls= new myclass();
	private myclass(){
		
	}
	
	public static myclass getdata(){
		System.out.println("This is Singletone Class");
		return cls;
	}
	
	
}


public class PracReverse {

	public static void main(String[] args) {
		// Reverse A string
		
		// Method 1
		
		String X= "Monkey Testing"; 
		StringBuffer Bf= new StringBuffer(X);
		System.out.println("Before Reverse: "+X);
		System.out.println("Before Reverse: "+Bf.reverse());
		
		// Method 2: 
		String REV=" ";
		for(int i=X.length()-1;i>=0;i--) {
			
		  REV+=X.charAt(i);
			
		}
		System.out.println("Method 2 Reverse: "+REV);
		
		StringBuilder SB= new StringBuilder("String Builder");
		System.out.println(SB);
		
	// Removing a duplicate character from a string
		
		Set<Character> RD= new HashSet<Character>();
		for(int i=0; i<X.length();i++) {
			RD.add(X.charAt(i));
		}
		System.out.println(RD);
		missing();
		
		myclass m= myclass.getdata();
		
	}
    
	// Find the Missing Element
	
	public static void missing() {
		
		double [] X= new double [] {1,3,4,5,6};
		double Totalsum= 6;
		double sum = 0;
		double Expected= (Totalsum * ((Totalsum + 1)/2));
		System.out.println(Expected);
		for(double i: X) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("Missing value is : "+(Expected-sum));
	}
	
	
	
	
}
