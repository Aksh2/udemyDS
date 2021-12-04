package search;

public class LinearSearch {

	public static void main(String[] args) {
		DataSet dataSet = new DataSet(1000000); 
		int search = 999999;
		Boolean isFound = false;
		for(int i=0;i<dataSet.getSize();i++) {
			dataSet.numberTry++;
			if(dataSet.data[i]==search) {
				
				System.out.println("Element is found after " + dataSet.numberTry + " try");
				isFound = true;
				break;
			}
		}
		
		if(isFound == false)
			System.out.println("Element is not found");
	}

}
