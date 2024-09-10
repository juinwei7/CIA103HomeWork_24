package idv.david.stream.additional;

import java.util.List;

import idv.david.stream.Employee;

public class Test01RemoveIf {

	public static void main(String[] args) {
		List<Employee> empList = Employee.createShortList();

		System.out.println("=== Starting List ===");
		empList.forEach(Employee::printSummary);

		empList.removeIf(e -> e.getState().equals("KS"));

		System.out.println("=== Ending List ===");
		empList.forEach(Employee::printSummary);
	}

}
