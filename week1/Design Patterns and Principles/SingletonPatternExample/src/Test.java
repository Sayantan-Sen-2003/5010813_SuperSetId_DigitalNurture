public class Test {
    public static void main(String[] args) {

        //  multiple instances of Logger attempt
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        // check same instance or not
        if (logger1 == logger2) {
            System.out.println("Both object are of same instance.");
        } else {
            System.out.println("different instances.");
        }
        
        // Test the logging functionality
        logger1.check("Checking log from logger1");
        logger2.check("Checking log from logger2");
    }
}


// Output:
// Both object are of same instance.
// Checking log from logger1
// Checking log from logger2
