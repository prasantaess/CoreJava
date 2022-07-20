package com.qa;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class ReverseString {

	public static void main(String[] args) {
		// Method 1: 
		
		String Name= " MahaLakshmi Ayaar";
		System.out.println("Before reverse the String is--"+ Name);
		System.out.println("Lenght of the String is--"+Name.length());
		String Rev="";
		for(int i= Name.length()-1;i>=0;i--) {
			Rev+= Name.charAt(i);
			}
		System.out.println("After Reverse the String---"+Rev);
		
		
		// Method 2
		System.out.println("This is method 2...");
		
		String Name1="Prasanta Paul";
		char ch[]= Name1.toCharArray();
		Set S1= new HashSet<>();
		Set S2= new HashSet<>();
		for(char M: ch) {
			if(S2.add(M)==false) {
				S1.add(M);
			}
			System.out.println(S1);
		}
		
	
	System.out.println("Method 3-----------------------");
	// Using String Buffer 
	
	String Name3= "KohaliDK,Boomra";
	StringBuffer bf=new StringBuffer(Name3);
	System.out.println("Before Reverse..."+Name3);
	System.out.println("After Reverse....."+bf.reverse());
		
	System.out.println("Method 4-----------------------");
	
	String Name4= "India Vs England";
	List<String> ls= Arrays.asList(Name4);
	System.out.println("Before Reverse..."+ls);
	List<String> ls2= ls.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	System.out.println(ls2);
	
	


}
}
