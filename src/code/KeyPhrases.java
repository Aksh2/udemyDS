package code;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyPhrases {
	public static void main(String[] args) {
		String text = "Suppose we have a set of English text documents and wish to rank which document is most relevant to the query, the brown cow . A simple way to start out is by eliminating documents that do not contain all three words the brown , and cow , but this still leaves many documents .";
		
		ArrayList<String> excludedWords = new ArrayList<>();
		
		excludedWords.add("the");
		excludedWords.add("a");
		excludedWords.add("by");
		excludedWords.add("to");
		excludedWords.add("and");
		excludedWords.add("of");
		excludedWords.add(",");
		excludedWords.add(".");
		excludedWords.add("is");
		
		HashMap<String,Integer> frequency = new HashMap<>();
		int maxFrequency = 0;
		
		String[] input = text.split(" ");
		for(String word: input) {
			if(excludedWords.contains(word)) {
				continue;
			}else {
				if(frequency.get(word)!=null) {
					int count = frequency.get(word)+1;
					frequency.put(word,count);
				}else {
					frequency.put(word,1);
				}
			}
			if(frequency.get(word)>maxFrequency) {
				maxFrequency=frequency.get(word);
			}
			
	}
		
		for(String key : frequency.keySet()) {
			if(maxFrequency==frequency.get(key))
			System.out.println(key + ":" + frequency.get(key));
		}
		
		

	}
}
