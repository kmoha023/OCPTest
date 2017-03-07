package treeSetTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("TreeMap");
		Map<String, String> map1 = new TreeMap<>();
		map1.put("Khaja", "Mohammmed");
		map1.put("Lion", "meat");
		map1.put("giraffe", "leaf");
		String food1 = map1.get("koala");

		for (String key1 : map1.keySet())
			System.out.println(key1);

	}
}
