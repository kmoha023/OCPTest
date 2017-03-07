package hashSetHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {

		System.out.println("HashMap");
		Map<String, String> map = new HashMap<>();
		map.put("khaja", "Mohammed");
		map.put("first", "last");
		map.put("new", "old");
		String name = map.get("khaja");
		System.out.println(name);
			Iterator<Map<String, String>> itr = ((Map<String,String>) map).iterator();
			while(itr.hasNext()){
				Map.Entry iter1 = (Map.Entry)itr.next();
				System.out.println(iter1.getKey() + "---" + iter1.getValue());
			}
		
	}

}
