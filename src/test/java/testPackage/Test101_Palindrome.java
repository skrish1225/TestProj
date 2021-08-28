package testPackage;

import java.util.Scanner;

public class Test101_Palindrome {

	  public static void main(String[] args) {
	     /*   Scanner in = new Scanner(System.in);
	        String input = in.next();*/
		  
	        System.out.println(isPalindrome("MOM"));
	    }
	    
	    public static boolean isPalindrome(String word) {
	    	String temp= "";	    	
	    	for (int i = word.length()-1; i >= 0; i--) {	    		
	    		temp  = temp +word.charAt(i);				
			}
	    	 return (temp.contentEquals(word));	         
	    }
}
