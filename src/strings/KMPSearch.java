package strings;

import java.util.Arrays;
import java.util.Scanner;

public class KMPSearch {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String pattern = sc.next();
		int[] lps = generateLPS(pattern);
		System.out.println(Arrays.toString(lps));
		System.out.println(searchPattern(input, pattern, lps));
		
		sc.close();
		
	}
	
	static int searchPattern(String input, String pattern, int[] lps) {
		int j = 0;
		for(int i=0;i<input.length();i++) {
			char a = input.charAt(i);
			j = getMatchedIndex(a, pattern,lps, j);
			if(j == pattern.length() -1) {
				return j;
			}
			j += 1;
		}
		return -1;
	}
	
	static int getMatchedIndex(char a, String pattern, int[] lps, int j) {
		char b = pattern.charAt(j);
		if(a==b) {
			return j;
		}
		else if(j==0) {
			return j-1;
		}
		return getMatchedIndex(a, pattern,lps, lps[j-1]);
	}
	
	static int[] generateLPS(String input) {
		int i = 0;
		int j = 1;
		int N = input.length();
		int[] lps = new int[N];
		
		for(; i<N && j<N ;j++) {
			i = getIndex(input, lps, i, j);
			lps[j] = i;
		}
		return lps;
	}
	
	static int getIndex(String input,int[] lps, int i, int j) {
		char a = input.charAt(i);
		char b = input.charAt(j);
		if(a == b) {
			return i+1;
		}
		else {
			i = i-1;
			if(i < 0) {
				return 0;
			}
			else {
				return getIndex(input, lps, lps[i], j);
			}
		}
	}

}
