package idv.david.stream.parallel;

import java.util.List;

import idv.david.stream.Employee;
import idv.david.stream.Role;

public class Test01Parallel {
	
public static void main(String[] args) {
        
        List<Employee> empList = Employee.createShortList();
        
        double result = empList.parallelStream()
            .filter(e -> e.getState().equals("CO"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> e.printSummary())
            .mapToDouble(e -> e.getSalary())
            .sum();
        
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);
        
        System.out.println("\n");
        
        // Call parallel from pipeline
        result = empList.stream()
            .filter(e -> e.getState().equals("CO"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> e.printSummary())
            .mapToDouble(e -> e.getSalary())
            .parallel()
            .sum();
        
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);               
    
        System.out.println("\n");
        
        // Call sequential from pipeline
        result = empList.stream()
            .filter(e -> e.getState().equals("CO"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> e.printSummary())
            .mapToDouble(e -> e.getSalary())
            .sequential()
            .sum();
        
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);               
    }
}
