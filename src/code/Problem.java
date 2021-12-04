package code;

public class Problem {
	
	public static void main(String args[]) {
		Problem p = new Problem();
		p.decodedString("an2[d]r3[oi2[d3[s]]]");
		
	}
		
	public String decodedString(String encoded) {
			String output = "";
			String input1 = splitByRegex(encoded,"\\[", true);
			System.out.println("input1:");
			System.out.println(input1);
			
			String stringWithoutAnyBrackets = splitByRegex(input1,"\\]",false);
			System.out.println("stringWithoutAnyBrackets:");
			System.out.println(stringWithoutAnyBrackets);
			
			String[] input3 = stringWithoutAnyBrackets.split("\\d");
			String[] input4 = stringWithoutAnyBrackets.split(" "); //splitByRegex(stringWithoutAnyBrackets, "\\[", true);
			
			System.out.println("input3:");
			printStringArray(input3);
			System.out.println("input4:");
			printStringArray(input4);
			
			//output+=input3[i+1];
			for(int i=0;i<input3.length;i++) {
				if(i+1<input3.length) {
					System.out.println("input4["+i+"]"+":"+ input4[i]);
					char repeatNum = input4[i].charAt(input4[i].length()-1);
							if(Character.isDigit(repeatNum)) {
								int value = Integer.valueOf(String.valueOf(repeatNum));
								String stringToBeRepeated = input3[i+1];
								System.out.println("String:"+ repeatStringByN(value, stringToBeRepeated));
								output+=repeatStringByN(value, stringToBeRepeated);
							}
				}
				
			}
				System.out.println("output: " +output);
			

			
		return "";
	}
	
	void printStringArray(String[] input) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}
	
	String splitByRegex(String input,String regex, Boolean addSpaces) {
		String concat ="";
		String[] array = input.split(regex);
		for(int i=0;i<array.length;i++) {	
			if(addSpaces) {
				concat+=array[i]+" ";
			}else {
				concat+=array[i];
			}
			
		}
		return concat;
	}
	
	String repeatStringByN(int n, String s) {
		String concat ="";
		for(int i=1;i<=n;i++) {
			concat+=s;
		}
		return concat;
	}
}
