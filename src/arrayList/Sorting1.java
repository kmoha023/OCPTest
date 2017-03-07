package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting1 {

	public static void main(String[] args) {

		List<Employee1> Employee = new ArrayList<>();
		Employee1 a1 = new Employee1(1, "john", "Peter", "33");
		Employee1 a2 = new Employee1(2, "Mike", "Samuel", "66");
		Employee1 a3 = new Employee1(3, "Robert", "Costa", "88");

		Employee.add(a1);
		Employee.add(a2);
		Employee.add(a3);

		System.out.println("Before sorting:" + Employee);

		System.out.println("After Sortiing using the Comparator");
		Collections.sort(Employee, new MyNewComparator());
		System.out.println(Employee);

	}

}

class MyNewComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		String name1 = e1.getfName().toString();
		String name2 = e2.getlName().toString();
		return name1.compareTo(name2);
	}

}
