package learncollection;

import java.util.Stack;

public class Example10 {
	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<Integer>();
		
		stack.push(12);// push is used for add elements and pop is used for remove last added elements
		stack.push(14);
		stack.push(20);
		
		System.out.println(stack);
		System.out.println(stack.search(12)); // search is used for search the elements
		
		
		System.out.println("-------------------");
		
		System.out.println(stack.pop());
		
		
		System.out.println(stack.peek()); // peek is used to see how many elements are left in stack
		System.out.println(stack);
		
		System.out.println(stack.empty()); // if your stack is empty it will give true other wise give false
		
		
		
		
		
		
		
	}

}
