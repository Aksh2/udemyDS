package com.problem;

import java.util.HashMap;
import java.util.Map;

public class CodeProblem {
	
	public static void main(String args[]) {
		
		System.out.println(countFrequency("aaabbacddda"));
	}
	
	static Map countFrequency(String input) {
		Map<String,Integer> frequencyMap = new HashMap<String, Integer>();
		for(int i=0;i<input.length();i++) {
			String ch = Character.toString(input.charAt(i));
			if(frequencyMap.containsKey(ch)) {
				int count = frequencyMap.get(ch);
				frequencyMap.put(ch,count+1);
			}else {
				frequencyMap.put(ch, 1);
			}
		}
		return frequencyMap;
	}

	

}



