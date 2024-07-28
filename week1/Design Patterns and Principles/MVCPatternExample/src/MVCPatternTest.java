public class MVCPatternTest {
    public static void main(String[] args) {
        // Fetch student record from the database (simulated here with a simple method)
        Student student = retrieveStudentFromDatabase();

        // Create a view to write student details on the console
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentId("101");
        controller.setStudentName("Sayantan Sen");
        controller.setStudentGrade("A");

        // Display updated student details
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setId("100");
        student.setName("Sayan Sen");
        student.setGrade("B");
        return student;
    }
}

//manupulating data from model (database simalaatin) & controller(admin logic)
// Output:
// Student Details: 
// Name: Sayan Sen
// ID: 100
// Grade: B
// Student Details: 
// Name: Sayantan Sen
// ID: 101
// Grade: A