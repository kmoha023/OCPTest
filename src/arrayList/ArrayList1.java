package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add(1, "Parrot");
		System.out.println(list);
		System.out.println(list.remove("Parrot"));
		System.out.println(list);

		// Looping through a List
		List<String> list3 = new ArrayList<>();
		list3.add("OCP");
		list3.add("Test");
		list3.add("Java");
		list3.add("Programmer II");

		System.out.println("For-each loop");
		for (String li : list3)
			System.out.println(li);

		System.out.println();
		System.out.println("Iterator");
		Iterator<String> iter = list3.iterator();
		while (iter.hasNext()) {
			String string = iter.next();
			System.out.println(string);

		}
	}

}
