package com.qa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class KeyMap {

	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		map.put("1", "Ram");
		map.put("1", "Krishna");
		map.put("3", "Bhuddha");
		map.put("4", "Kalki");
		map.put("5", "Ram");
		
		map.entrySet().stream().forEach(e->System.out.println(e));
		
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "Narayan");
		map1.put(2, "Bishnu");
		map1.put(3, "Mahesh");
		map1.put(1, "Bholanata");
		
		map1.keySet().stream().forEach(E-> System.out.println(E));
		
		
		
		
		

	}

}
