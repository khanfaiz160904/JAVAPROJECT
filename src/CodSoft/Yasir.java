package CodSoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Yasir {

	public static void main(String[] args) {
		List<Map<String, Integer>> listofMaps = new ArrayList<Map<String, Integer>>();
		Map<String, Integer> map = new HashMap<>();
		map.put("id", 23);
		map.put("cid", 24);
		listofMaps.add(map);
		System.out.println(listofMaps);
		
		for (Map<String, Integer> map2 : listofMaps) {
			for (Map.Entry<String, Integer> mapEntry : map2.entrySet()) {
				System.out.println(mapEntry.getKey());
			}
		}
	}
}