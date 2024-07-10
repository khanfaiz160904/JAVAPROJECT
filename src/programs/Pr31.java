package programs;

import java.util.Enumeration;
import java.util.Vector;

public class Pr31 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("faiz");
		v.add(14);
		v.add("khan");
		v.add(64);
		v.add(43);
		System.out.println(v);

//		ENUMERATION;

		
		Enumeration e=v.elements();
		while ( e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
			
		}

//  ALL METHODS OF VECTOR;

//		v.addElement(40);
//		v.firstElement();
//		v.lastElement();
//		v.removeElement(14);
//		v.removeElementAt(4);
//		v.removeAllElements();
//		v.capacity();

//		System.out.println(v);

	}

}
