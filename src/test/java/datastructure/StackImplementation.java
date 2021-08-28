package datastructure;

public class StackImplementation {

	static int stack[];

	
	
	public static void main(String[] args) {
		stack = new int[] {1,2,3,4};
		pop();
		
		
	for (int i = 0; i < stack.length; i++) {
		System.out.println(stack[i]);
	}
		
		// TODO Auto-generated method stub
		
		//lifo 1,2,3,4
		

	}
	
	public static int[] push(int value) {
	int stackTemp[] = new int[stack.length + 1];
	stackTemp[0] = value;
	for (int i = 0; i < stack.length; i++) {
		stackTemp[i+1] = stack[i];
	}
	stack = new int[stackTemp.length];
	stack = stackTemp;
	return stackTemp;
	}
	
	public static void pop() {
		int tempstack[] = new int[stack.length-1];
		for (int i = 1; i < stack.length; i++) {
			tempstack[i-1] = stack[i];
		}
		stack = new int[tempstack.length];
		stack = tempstack;
	}

}
