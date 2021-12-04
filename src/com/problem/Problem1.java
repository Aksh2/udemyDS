package com.problem;

public class Problem1 {
	public static void main (String args[]) {
		Problem1 p = new Problem1();
		System.out.println(p.getMaximumProfit(new int[] {7,6,4,3,1}));
	}
	
	public int getMaximumProfit(int[] input) {
		int maxDiff = -1;
		for(int currentIndex=0; currentIndex< input.length;currentIndex++) {
			for(int nextIndex=currentIndex+1; nextIndex < input.length; nextIndex++) {
				if(input[nextIndex]>input[currentIndex]) {
					int diff = input[nextIndex] - input[currentIndex];
					if(diff>maxDiff) {
						maxDiff = diff;
					}
				}
				
			}
			
		}
		return maxDiff;
	}
}
