package hashSetHashMap;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {

		System.out.println("HashSet");
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66); 
		boolean b2 = set.add(20); 
		boolean b3 = set.add(14); 
		boolean b4 = set.add(66); 
		boolean b5 = set.add(13); 
		for (Integer integer : set)
			System.out.println(integer + ",");

	}
}
