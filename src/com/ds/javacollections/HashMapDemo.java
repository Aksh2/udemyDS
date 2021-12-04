package com.ds.javacollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"hussian");
		map.put(4,"jena");
		map.put(555,"laya");
		System.out.println(map.get(1));
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println("key "+ m.getKey() + ",value " + m.getValue());
		}
		
		map.put(1, "hussien alrubay");
		System.out.println(map.get(1));
		map.remove(1);
	}

}
