package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;





public class SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of all number
		List<Integer>ls= new ArrayList<Integer>(Arrays.asList(1,3,4,5,6,7,8,9,37));
		Optional<Integer>Sum= ls.stream().reduce((a,b)->a+b);
		System.out.println(Sum);
		// Avg of the Number
		double Avg= ls.stream().mapToLong(e->e).average().getAsDouble();
		System.out.println(Avg);
		// Print Double then filter print only numbers whose squre is greater then  >100
		double Avg1= ls.stream().mapToDouble(e->e*e).filter(e->e>100).average().getAsDouble();
		System.out.println(Avg1);
		// Print Odd Even
		List<Integer> Odd= ls.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(Odd);
		//prefix Start with "2"
		
		List<Object> ls1= new ArrayList<Object>(Arrays.asList(201,210,410,310,201,199,512,318,253,253));
		List<Object> StartTwo= ls1.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(e->Integer.valueOf(e)).collect(Collectors.toList());
		System.out.println(StartTwo);
		
		// Find the Duplicate Value from a list
		// Approach 1:
		List<Integer> ls2= new ArrayList<Integer>(Arrays.asList(201,210,410,310,201,199,512,318,253,253));
		List<Integer> Dup_find = ls2.stream().filter(e->Collections.frequency(ls2,e)>1).collect(Collectors.toList());
		System.out.println(Dup_find);
		
		// Approach 2:
		
		Set<Integer> S= new HashSet<Integer>();
		Set<Integer> S2 = ls2.stream().filter(e->!S.add(e)).collect(Collectors.toSet());
		System.out.println(S2);
		
		// Remove the Duplicate Element..
		
		Set<Integer> S3= new HashSet<Integer> (ls2);
		List<Integer> L3= new ArrayList<Integer>(S3);
		System.out.println(S3);
		System.out.println(L3);
		
		// convert List to Array
		
		int[] A= new int[S3.size()];
		for(int i =0; i<S3.size();i++) {
			A[i]= L3.get(i);
		}
		for(int i=0;i<A.length;i++) {
		   System.out.println(A[i]);	
		}
		
		System.out.println("--------------------");
	//	find the Max and min value 
		
		int Max = L3. stream(). max(Comparator.comparing(e->Integer.valueOf(e))).get(); 
		System.out.println(Max);
		
		int Min= L3.stream().min(Comparator.comparing(e->Integer.valueOf(e))).get();
		
		System.out.println(Min);
		// Sort the List
		
		List<Integer> SortNumber = L3.stream().sorted().collect(Collectors.toList());
		System.out.println(SortNumber);
		
		// Sort the Reverse Order 
		
		List<Integer> Rev_Order= L3.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(Rev_Order);
		
		// Get The 2nd Height number from the list 
		
		int Height_value= L3.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(Height_value);
		
		// Get 2nd lowest value
		
		int Lowest_value= L3.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println(Lowest_value);
		
		//  get the 3rd lowest value
		
		int Lowest_third= L3.stream().sorted().distinct().limit(3).skip(2).findFirst().get();
		System.out.println(Lowest_third);
		
		// Skip First 3 Numbers
		
		List<Integer> Lowest_Value = L3.stream().sorted().distinct().skip(3).collect(Collectors.toList());
		System.out.println(Lowest_Value);
		
		// Limit The value 
		
		List<Integer> Lowest_Limit = L3.stream().sorted().distinct().limit(3).collect(Collectors.toList());
		System.out.println(Lowest_Limit);
		
		// Compare two Arrray List 
		
		List<String> CL= Arrays.asList("A", "B","C","D","E");
		List<String> CL2= Arrays.asList("A", "B","M","N","o");
		
		List<Integer> CL3= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		List<Integer> CL4= new ArrayList<Integer>(Arrays.asList(1,2,3,9,0,7));
		System.out.println(CL.equals(CL2));
		
		// Find the Differents
		
		 	CL3.removeAll(CL4); 
		     System.out.println(CL3);
		
		// Find the Common 
		
			CL3.retainAll(CL4);
			System.out.println(CL3);
	
	
	// Split Of the String 
	
	String Split= "This method takes collection c as a parameter containing elements to be removed from this list"; 
	String[] Split2= Split.split(" ");
	for( int i=0; i< Split2.length; i++) {
		System.out.println(Split2[i]);
	}
	
	// Empty Set
	
	Set<Integer>List = new HashSet<Integer>();
	//System.out.println(List.isEmpty());
	
	// Convert String to Integer
	
	String Str= "12345";
	Integer X= Integer.parseInt(Str);
	System.out.println(X);
	
	// Convert Integer To String 
	
	String XX= X.toString();
	System.out.println(XX);
	
	// Convert To Byte
	
	byte Y= X.byteValue();
	System.out.println(Y);
	
	// Calculate the Total number of character in a string ...
	int count = 0;
	for ( int i=0; i<Split.length();i++) {
		if(Split.charAt(i) != ' ') {
			count++;
		}
			
		
	}
	System.out.println(count);
	
	// Calculate the number of character repeatate in a string ...... ...
	String Str1="MicrosoftApple";
	char [] ch= Str1.toCharArray();
	Set<Object> S1= new HashSet<Object>();
	Set<Object> SS3= new HashSet<Object>();
	for(char ch1: ch) {
		if(S1.add(ch1)==false) {
			SS3.add(ch1);
		}
		System.out.println(S1);
		System.out.println(SS3);
	}
	
	
	
	
	
	
	
	
	
	
	}
}
