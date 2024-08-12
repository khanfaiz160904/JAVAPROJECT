package programs;

import java.util.HashSet;

public class HashSetCollection {
	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(hs);
		System.out.println(hs);
	}

}
