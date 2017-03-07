package treeSetTreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import arrayList.Employee1;

public class TreeSet1 {

	public static void main(String[] args) {

		System.out.println("TreeSet");
		// No Duplicates
		Set<Employee1> set1 = new TreeSet<>(new MyNewComparator());
		Employee1 e1= new Employee1(1, "john", "Peter", "33"); 
		Employee1 e2= new Employee1(2, "Mike", "Samuel", "66");
		Employee1 e3= new Employee1(3, "Robert", "Costa", "88");
		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		
		for (Employee1 employee1 : set1)
			System.out.println(employee1);
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