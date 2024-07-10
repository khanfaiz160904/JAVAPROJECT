package programs;

import java.util.Enumeration;
import java.util.Vector;

public class Pr11 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add("Faiz");
		v.add(24);
		v.add(44.4);

//		System.out.println(v);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}

	}

}
