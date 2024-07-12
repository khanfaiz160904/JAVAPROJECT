package programs;

import java.util.Stack;

public class StackCollection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(19);
		s.push(20);
		s.push("faiz");
		s.push(89);
		System.out.println(s);
//		System.out.println(s.pop());
//		System.out.println(s.peek());
		System.out.println(s.search(89));

	}

}
