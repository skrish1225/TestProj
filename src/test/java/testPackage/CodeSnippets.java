package testPackage;

public class CodeSnippets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if((a[i]+ a[j])==10) {
					System.out.println("======================================");
					System.out.println("Index is "+i+" Number is "+a[i]);
					System.out.println("Index is "+j+ " Number is "+a[j]);
				}
				
			}
		}

	}

}
