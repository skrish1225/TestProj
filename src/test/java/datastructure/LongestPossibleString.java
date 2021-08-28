package datastructure;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

public class LongestPossibleString {
	
	
/*Concatinate all the combination of strings and tell the longest combination with unique values
String[]input = {"ab","ri","ac","sjd"};
The asnswer will be 5 as the longest unique combination is absjd, risjd, acsjd*/
	@Test
	public void test() {
		String[]input = {"ab","ri","ac","sjd"};
		
		
		ArrayList<String> uniqueCombinaions = generateCombination(input);
		System.out.println(uniqueCombinaions);
		findTheLargestString(uniqueCombinaions);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void findTheLargestString(ArrayList<String> input) {
		int len = 0;
		String longestCombination = "";
		for (String string : input) {
			if(string.length()>len) {
				len = string.length();
				longestCombination = string;
			}
			
		}
		System.out.println(len);
		System.out.println(longestCombination);
	}

	private static ArrayList<String> generateCombination(String[]input) {
		ArrayList<String> combinations = new ArrayList<String>();
		ArrayList<String> listWithoutDuplicates = new ArrayList<String>();
		StringBuffer concatString = new StringBuffer();
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				combinations.add(input[i] + input[j]);
			}
		}
		
		for (String string : combinations) {
			if(!ifTheStringHasDuplicates(string)) {
				listWithoutDuplicates.add(string);
			}
		}
		//ArrayList<String>inputList = (ArrayList<String>) Arrays.asList(input);
		
		return listWithoutDuplicates;
		
	}

	public static boolean ifTheStringHasDuplicates(String source) {
		int count = 0;
		boolean stringHasDuplicates = false;
		for (int i = 0; i < source.length(); i++) {
			for (int j =0; j < source.length(); j++) {
				if(source.charAt(j)==source.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				stringHasDuplicates = true;
				break;
			}else {
				count = 0;
			}
			
		}
	return stringHasDuplicates;
	}
}
