package week1.Data_Structure_and_Algorithms.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Add employees
        ems.addEmployee(new Employee("E001", "Alice", "Manager", 60000));
        ems.addEmployee(new Employee("E002", "Bob", "Developer", 50000));
        ems.addEmployee(new Employee("E003", "Charlie", "Designer", 45000));

        // Traverse employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearch for Employee E002:");
        Employee foundEmployee = ems.searchEmployee("E002");
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDelete Employee E002:");
        ems.deleteEmployee("E002");
        ems.traverseEmployees();
    }
}

// output:
// All Employees:
// Employee{employeeId='E001', name='Alice', position='Manager', salary=60000.0}
// Employee{employeeId='E002', name='Bob', position='Developer', salary=50000.0}
// Employee{employeeId='E003', name='Charlie', position='Designer', salary=45000.0}

// Search for Employee E002:
// Found: Employee{employeeId='E002', name='Bob', position='Developer', salary=50000.0}

// Delete Employee E002:
// Employee{employeeId='E001', name='Alice', position='Manager', salary=60000.0}
// Employee{employeeId='E003', name='Charlie', position='Designer', salary=45000.0}