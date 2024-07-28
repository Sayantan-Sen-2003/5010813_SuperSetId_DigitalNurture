public class Logger {
   
    private static Logger instance;
    
    
    private Logger() {
       
    }
    
    // Public static method to provide single instance of the class
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
   
    public void check(String message) {
        System.out.println(message);
    }
}

