package week1.Data_Structure_and_Algorithms.TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks
        taskList.addTask(new Task("T001", "Design Database", "Pending"));
        taskList.addTask(new Task("T002", "Implement API", "In Progress"));
        taskList.addTask(new Task("T003", "Test Application", "Pending"));

        // Traverse tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearch for Task T002:");
        Task foundTask = taskList.searchTask("T002");
        if (foundTask != null) {
            System.out.println("Found: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDelete Task T002:");
        taskList.deleteTask("T002");
        taskList.traverseTasks();
    }
}


// output:
// All Tasks:
// Task{taskId='T001', taskName='Design Database', status='Pending'}
// Task{taskId='T002', taskName='Implement API', status='In Progress'}
// Task{taskId='T003', taskName='Test Application', status='Pending'}

// Search for Task T002:
// Found: Task{taskId='T002', taskName='Implement API', status='In Progress'}

// Delete Task T002:
// Task{taskId='T001', taskName='Design Database', status='Pending'}
// Task{taskId='T003', taskName='Test Application', status='Pending'}