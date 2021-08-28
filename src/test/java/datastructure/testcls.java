package datastructure;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.TreeSet;

public class testcls {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		TreeSet<String>t = new TreeSet<String>();
		t.add("sdfsd2");
		t.add("sdfsd	");
		t.add("sdfsd3");*/
		
		//System.out.println(t);
		
		
		//ArrayList<String>ar = new ArrayList<String>();
		ArrayList<Object>ar1 = new ArrayList<Object>();
		ar1.add("1");
		ar1.add("2");
		ar1.add("3");
		String temp = ar1.get(1).toString();
		Integer.parseInt(ar1.get(1).toString());
		/*ar1.
		System.out.println(temp);*/
	}

	@Test
	public  void  testme(){
		System.out.println("Check if this runs");
	}



}
