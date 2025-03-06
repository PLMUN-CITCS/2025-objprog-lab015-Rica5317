public class VariableScope {
    // Global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print globalCount in main method
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call showScope method
        showScope();
    }

    public static void showScope() {
        // Local variable
        int localCount = 50;
        
        // Print globalCount and localCount in showScope method
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
