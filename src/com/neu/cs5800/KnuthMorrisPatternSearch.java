package com.neu.cs5800;

import java.util.Arrays;

//Knuth Morris Pattern search algorithm
public class KnuthMorrisPatternSearch {
	
	boolean patternSearchKMP(String s, String p){
		int [] pattern_array= createNumericPattern(p);
		
		for(int i=0; i<s.length();i++){
			
		}
		return false;
	}

	int[] createNumericPattern(String p) {
		int [] pattern_array=new int[p.length()];
		int i=1, j=0;
		while(i<p.length()){
			if(p.charAt(i)==p.charAt(j)){
				pattern_array[i]= j+1;
				i++;
				j++;
			}
			else{
				if(j!=0){
					j=pattern_array[j-1];
				}
				pattern_array[i]=0;
				i++;
			}
		}
		System.out.println(Arrays.toString(pattern_array));
		return pattern_array;
	}

	public static void main(String[] args) {
		String s = "aabccbbaabbccbbaaccaabb";
		String pattern = "aaabbbbcabc";
		KnuthMorrisPatternSearch kmps = new KnuthMorrisPatternSearch();
		kmps.patternSearchKMP(s, pattern);
	}

}
