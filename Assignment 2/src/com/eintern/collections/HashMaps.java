package com.eintern.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaps {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		
		
		//Add Values to a hashMap
		map.put("1", "10");
		map.put("2", "20");
		map.put("3", "30");
		map.put("4", "40");
		map.put("5", "50");
		
		//Add Values to a TreeMap
		treemap.put(1, "Hello");
		treemap.put(2, "Goodbye");
		treemap.put(3, "World");
		treemap.put(4, "Yadada");
		treemap.put(5, "Blah!");
		
		//Showing Iteration through HashMap
		for(Map.Entry<String, String> maps : map.entrySet()){
			System.out.println("Keys are: " + maps.getKey() + " Values are: " + maps.getValue());
		}
		
		System.out.println("TreeMap: " + treemap);
		if(treemap.containsKey(1)){
			System.out.println("TreeMap has 1 Key");
		}else{
			
			System.out.println("TreeMap does not have 1 Key");
		}
		if(treemap.containsKey(2)){
			System.out.println("TreeMap has 2 Key");
		}else{
			
			System.out.println("TreeMap does not have 2 Key");
		}
		if(treemap.containsKey(3)){
			System.out.println("TreeMap has 3 Key");
		}else{
			
			System.out.println("TreeMap does not have 3 Key");
		}
		if(treemap.containsKey(4)){
			System.out.println("TreeMap has 4 Key");
		}else{
			
			System.out.println("TreeMap does not have 4 Key");
		}
		if(treemap.containsKey(5)){
			System.out.println("TreeMap has 5 Key");
		}else{
			
			System.out.println("TreeMap does not have 5 Key");
		}
	}
	
}
