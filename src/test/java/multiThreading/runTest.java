package multiThreading;

public class runTest{

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new Browser("ChromeThread", "chrome"));
		Thread t1 = new Thread(new Browser("ChromeThread2", "chrome"));
	
		t.start();
		t1.start();

	}

	
	
}
