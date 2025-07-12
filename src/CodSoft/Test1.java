package CodSoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test1 {
//create hashmap object and insert value and iterate using iterator	;
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1, "mohammad");
		hMap.put(2, "faiz");
		hMap.put(3, "khan");

		Iterator<Entry<Integer, String>> iterator = hMap.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}