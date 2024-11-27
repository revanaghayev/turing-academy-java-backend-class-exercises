package TuringAcademyTasks.OOP;

public class Example {
    // Instance variable (each object gets its own copy)
    int instanceCount = 0;

    // Static variable (shared among all objects)
    static int staticCount = 0;

    // Constructor
    Example() {
        // Increment both counters
        instanceCount++;
        staticCount++;
    }

    // Method to display counts
    void displayCounts() {
        System.out.println("Instance Count: " + instanceCount);
        System.out.println("Static Count: " + staticCount);
    }
}