package datastructure;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class ProgrammingQuestions {
	
	public static void main(String[] args) {
		//int ar[] = new int[] {9,3,29,33,49,1};
		//ar = sortArray(ar);
		
		/*int ar[] = new int[] {4,3,9,4,9,4,3,4,9,9,9};
		giveOccuranceAndPrint(ar);*/
		//System.out.println(numberOfOccurance("aaabbddaabbcc"));
		//sortAnArrayUsingsingleLoop();
		//sumOf2NumbersInAnArray(8);
		//moveDuplicateNumbersToTheRight();
		segeregate();
		//arrangeInIncreasingOrder();
		
	}
	
	
	//Segregate 0s and 1s without using any sorting techniques and use only 1 for loop
	public static void segeregate() {
		String input = "10001110011001111";
		String temp0="";
		String temp1="";
		for (int i = 0; i < input.length(); i++) {
			if(Character.toString(input.charAt(i)).contentEquals("0")) {
				temp0 = temp0+"0";
			}else if(Character.toString(input.charAt(i)).contentEquals("1")) {
				temp1 = temp1+"1";
			}
			
		}
		System.out.println(temp0+temp1);
	}
	
	
	/**
	 * “This is new” => Arrange it in increasing length order of words. i.e “is new This”
	 */
	public static void arrangeInIncreasingOrder() {
		
		String input = "This is new";
		
		String[] inputArray = input.split(" ");
		
		TreeMap<Integer, String> cotainer  = new TreeMap<Integer, String>();

		
		//Hashtable<Integer, String> cotainer  = new Hashtable<Integer,String>();
		
		for (String string : inputArray) {
			cotainer.put(string.length(), string);
			
		}
		
		System.out.println(cotainer);
		
		Set<Integer>s = cotainer.keySet();
	
		
		for (Integer integer : s) {
			System.out.print(cotainer.get(integer));
			System.out.print(" ");
			
		}
		
	}
	
	@Test
	public void checkCode() {
		
		
		System.out.println(checkIfANumberisPrime(11));
	}

	//if [4,3,9,4,9,4,3,4,9,9,9] print > [9,9,9,9,9,4,4,4,4,3,3] 
	public static void giveOccuranceAndPrint(int ar[]) {
		
		int md[][] = new int [ar.length][2];
		
		    int ar1[]  = sortDscArray(ar);
		    for (int i = 0; i < ar1.length; i++) {
				System.out.println(ar[i]);
			}
		    
		    
		     
	}
	
	
	
	//sort an array [9,3,29,33,49,1]
	public static int[] sortAscArray(int arr[]){
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		return arr;
	}
	
	//sort an array [9,3,29,33,49,1]
		public static int[] sortDscArray(int arr[]){
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			
			return arr;
		}
		
		
		/**
		 * Check if number is prime
		 * @param number
		 * @return
		 */
		public static boolean checkIfANumberisPrime(int number) {
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				
				return false;
			}
		}
		return true;
		}
		
		
		public static ArrayList<Integer> fibonachiSeris(int limit) {
			int j=0;
			ArrayList<Integer> finalList =new ArrayList<Integer>();
			finalList.add(0);
			finalList.add(1);
			
			
			for(int i=0;i<limit;i++) {
				
				j = finalList.get(i) + finalList.get(i+1); 
				finalList.add(j);
				
			}
			return finalList;
		}
		
		//n a sequence of alphabets (like aaabbddaabbcc) 
		//write a program to find the number of the consecutive alphabets in and print the alphabet and number.
		//example :if input is aaabbddaabbcc then output should be 3a, 2b, 2d, 2a, 2b, 2c
		
		public static String numberOfOccurance(String input) {
			String firstWord=Character.toString(input.charAt(0));
			String nextWord="";
			  Hashtable<String, Integer> ht2 = new Hashtable<String, Integer>();
			int count=0;
			for (int i = 0; i < input.length(); i++) {
				if(Character.toString(input.charAt(i)).equals(firstWord)) {
					firstWord = Character.toString(input.charAt(i));
					count ++;
					
				}else {
					firstWord = Character.toString(input.charAt(i));
					System.out.println(Character.toString(input.charAt(i-1)) + " = "+count );
					ht2.put(Character.toString(input.charAt(i-1)), count);
					
					count = 1;
				}
			}
			System.out.println(ht2);
			String outPut = "";
			String finalOutput = "";
			Set<String>s = ht2.keySet();
			for (String string : s) {
				outPut = string+ " - "+ ht2.get(string)+",";
				finalOutput = finalOutput+outPut;
			}
			return finalOutput.substring(0, finalOutput.length()-1);
		}
		
		
		public static void sortAnArrayUsingsingleLoop() {
			int[] inputArray= {100, 110, 111, 1, 3, 19, 1, 11, -10};
			
			
			int i =0;
			while (i<inputArray.length-1) {
				System.out.println(i);
				//System.out.println(inputArray[i] + " -- "+inputArray[i+1]);
				if(inputArray[i]>inputArray[i+1]) {
					
					int temp = inputArray[i];
					inputArray[i] = inputArray[i+1];
					inputArray[i+1] = temp;
					
					i = -1;
					
				}
				i++;
			}
			System.out.println("-------------");
			for (int j : inputArray) {
				System.out.println(j);			
			}
			
			
			
			 
			/*for (int i = 0, j=i+1; i < inputArray.length && j<inputArray.length;) {
				if(inputArray[i]>inputArray[j]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
					i = 0;
					j = i+1;
				}else {
					i++;
					j++;
				}
			}
		for (int i : inputArray) {
			System.out.println(i);			
		}*/
		
		}
		
		
		
		/**
		 * Write a program to find out in a sorted array the sum of any two numbers present in the array is closest to the a number given. 
		 * if you have an array 4, 6, 8,24,36 and the given number is 31 
		 * then output should be 24 + 6 = 30
		 */
		public static void sumOf2NumbersInAnArray(int value) {
			Hashtable<Integer, String> listOfSums = new Hashtable<Integer, String>();
			int[] ar = {4, 6, 8,24,36};
			//Hash table with all sums
			for (int i = 0; i < ar.length; i++) {
				for (int j = i+1; j < ar.length; j++) {
					listOfSums.put(ar[i]+ar[j],ar[i]+"+"+ar[j]);
				}
			}
			//Hash table with [value - sum] as key and sum as value 
			Set<Integer> sums = listOfSums.keySet();
			Hashtable<Integer, Integer> fnl= new Hashtable<Integer, Integer>();
			int tempVar = 1000;
			for (Integer integer : sums) {
				fnl.put(Math.abs(integer - value), integer);				 
				//System.out.println(listOfSums.get(integer) + " -"+integer);
			}
			
			Set<Integer> diffOfsums = fnl.keySet();
			int temp = 1000;
			for (Integer integer : diffOfsums) {
				if(integer < temp) {
					temp= integer;
				}			 
				//System.out.println(listOfSums.get(integer) + " -"+integer);
			}
			System.out.println("----------------------");
			int ky = fnl.get(temp);
			System.out.println(listOfSums.get(ky) + "-- "+ky);
			
			
		}
		
		/**
		 * Given an array filled with 'n' random numbers, 
		 * each number may or may not be repeated again in the array, (mix of duplicates and unique numbers) 
		 * shift all non-duplicates to the start of the array. for example,
		 *  if array is {4,2,17,2,56,2,4} output should be {4,2,17,56...} the remaining part of array can be modified to anything, doesnt matter
		 */
		public static void moveDuplicateNumbersToTheRight() {
			int[] input = {4,2,17,2,56,2,4};
			ArrayList<Integer> check = new ArrayList<Integer>();
			ArrayList<Integer> mate = new ArrayList<Integer>();
			ArrayList<Integer> finalList = new ArrayList<Integer>();
			for (int i = 0; i < input.length; i++) {
				if(!check.contains(input[i])) {
					check.add(input[i]);
				}else {
					mate.add(input[i]);
				}
			}
			
			for (Integer integer : check) {
				finalList.add(integer);
			}
			for (Integer integer : mate) {
				finalList.add(integer);
			}
			int[]output = new int[input.length];
			for (int i = 0; i < output.length; i++) {
				output[i] = finalList.get(i);
			}
			
			
			for (int i : output) {
				System.out.println(i);
			}
		}
		
		
}
