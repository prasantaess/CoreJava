package com.qa;

import java.util.HashSet;
import java.util.Set;

public class PracTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J= "ABCDEFABCGHABC" ;
        char[] ch = J.toCharArray();
        Set<Object> S1= new HashSet<Object>();
        Set<Object> S2= new HashSet<Object>();
        for (char C: ch){
            if(S1.add(C)==false){
                S2.add(C);
            }
           S1.stream().forEach(null);
        }
        
	}

}
