package com.qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// Empty Stream.
		
		Stream<String> emptyStream = Stream.empty();
		System.out.println("Size of the empty String ::: "+emptyStream.count());
		
		// Create a stream of a value 
		
		Stream<String> StudentStd = Stream.of("Ram","Krishna","Vishnu","Buddha","Kalki");
		//System.out.println(StudentStd.count());
		StudentStd.forEach(e-> System.out.println(e));
		
		// Creating stream of collections
		
		List<Character> listchar = new ArrayList<Character>();
		listchar.add('a');
		listchar.add('b');
		listchar.add('c');
		listchar.add('d');
		listchar.add('a');
		listchar.add('b');
		int count= (int) listchar.stream().filter(e->Collections.frequency(listchar, e)>0).count();
		System.out.println(count);
		Set<Character> listChar2= listchar.stream().filter(e->Collections.frequency(listchar, e)>0).collect(Collectors.toSet());
		listChar2.stream().forEach(e->System.out.println(e));
		System.out.println("----------------------------");
		// method 2
		Set<Character> listChar3 = new HashSet<Character>();
		Set<Character> listChar4 = listchar.stream().filter(e -> !listChar3.add(e)).collect(Collectors.toSet());
		listChar4.stream().forEach(e->System.out.println(e));
	

  // Find the duplicate character from String 
	 
	String Input=  "javajavastringjavaj2ee";
    Map<Character,Long> mapoutput = Input.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(c -> (char)c, Collectors.counting()));
    mapoutput.forEach((k,v)-> { if (v>1) {
    	System.out.println(k+"  :  " + v);
    }
    });
    
    Set<Character> S=  new HashSet<Character>();
    for(int i=0; i<Input.length();i++) {
    	S.add(Input.charAt(i));
    }
    S.stream().forEach(e->System.out.println(e));

	}
}
