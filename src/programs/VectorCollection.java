package programs;

import java.util.Enumeration;
import java.util.Vector;

public class VectorCollection {
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		Vector<Comparable> v = new Vector<Comparable>();
		v.add(10);
		v.add("Faiz");
		v.add(24);
		v.add(44.4);

//		System.out.println(v);

		@SuppressWarnings("rawtypes")
		Enumeration<Comparable> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}

	}

}
