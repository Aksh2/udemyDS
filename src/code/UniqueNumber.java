package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumber {

	public static void main(String[] args) {
		int[] array = {1,3,5,6,6,7,8,10,10};
		
		ArrayList<Integer> listNumber = new UniqueNumber()
				.getUniqueNumber(array);
		
		for(Integer number: listNumber) {
			System.out.println(number);
		}

	}
	
	ArrayList<Integer> getUniqueNumber(int[] array){
		ArrayList<Integer> uniqueList = new ArrayList<>();
		Map<Integer,Integer> uniqueMap = new HashMap<Integer,Integer>();
		for(int index=0; index<array.length; index++) {
			if(uniqueMap.get(array[index])!=null) {
				int frequency = uniqueMap.get(array[index]);
				uniqueMap.put(array[index], frequency+1);
			} else {
				uniqueMap.put(array[index], 1);
			}
		}
		
		for(int number: uniqueMap.keySet()) {
			if(uniqueMap.get(number)==1) {
				uniqueList.add(number);
			}
		}
		
		return uniqueList;
	}

}
