package programs;

import java.util.ArrayList;

public class ArrayListCollection {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>(0);
		al.add(10);
		al.add("sdfg");
		al.add('c');
		al.add(true);
		al.add(1234567890);
		System.out.println(al);
		
		
	}

}
