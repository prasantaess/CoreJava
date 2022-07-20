package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxValue {

	public static void main(String[] args) {
		
	List<String> list = new ArrayList<String>(Arrays.asList("$500","$400","$300","$200","$100"));	
	// Select The Max Value Without dollar. 
	
	double max = list.stream().mapToDouble(e->Double.parseDouble(e.trim().replace("$", ""))).max().getAsDouble();
	int min = list.stream().mapToInt(e->Integer.parseInt(e.trim().replace("$", ""))).min().getAsInt();
	String minv = list.stream().min(Comparator.comparing(e->String.valueOf(e))).get();
	String x= minv.trim().replace("$", "");
	System.out.println(max);
	System.out.println(min);
	System.out.println(minv);
	System.out.println(x);

	}
	
	


}
