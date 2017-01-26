package com.neu.cs5800;

import java.util.Arrays;

//Knuth Morris Pattern search algorithm
// Complexity O(m+n), m=length of text and n = length of pattern
public class KnuthMorrisPatternSearch {
	
	boolean patternSearchKMP(char[] text, char[] pattern){
		int [] pattern_array= createNumericPattern(pattern);
        int i=0;
        int j=0;
        while(i < text.length && j < pattern.length){
            if(text[i] == pattern[j]){
                i++;
                j++;
            }else{
                if(j!=0){
                    j = pattern_array[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j == pattern.length){
            return true;
        }
        return false;
	}

	int[] createNumericPattern(char[] p) {
		int [] pattern_array=new int[p.length];
		int i=1, j=0;
		while(i<p.length){
			if(p[i]==p[j]){
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
		String pattern = "ccbbaa";
		KnuthMorrisPatternSearch kmps = new KnuthMorrisPatternSearch();
		System.out.println(kmps.patternSearchKMP(s.toCharArray(), pattern.toCharArray()));
	}

}
