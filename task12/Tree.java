package task12;

import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		TreeMap<Integer,String> employeedata = new TreeMap<>();
		
		employeedata.put(22, "Kratos");
		employeedata.put(23, "Ezio");
		employeedata.put(10, "Nathen Drake");
		employeedata.put(9, "Loki");
		
		System.out.println("Name all employees in alphatical order");
		
		for(String name: employeedata.values()) {
			System.out.println(name);
		}
	}

}
