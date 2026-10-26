/**
 * Driver program to test Lab 2 functionality.
 * Demonstrates abstract class instantiation errors and dynamic binding.
 */
public class StudentDemo {
    public static void main(String[] args) {
        // Exercise 2.1 - Step 2: Attempting direct instantiation
        System.out.println("--- Task 1: Direct Instantiation Verification ---");
        System.out.println("Note: Un-commenting the line below will cause a compilation error:");
        System.out.println("Java Error: Student is abstract; cannot be instantiated");
        // Student sError = new Student("Alice", "101", 2024);

        System.out.println("\n--- Task 2: Testing Polymorphic Assignment & Dynamic Binding ---");
        Student s = new CompSciStudent("Bob", "102", 2024);
        
        // sample hours
        if (s instanceof CompSciStudent) {
            CompSciStudent csStudent = (CompSciStudent) s;
            csStudent.setMathHours(15);
            csStudent.setCsHours(30);
            csStudent.setGenEdHours(45);
        }

        System.out.println(s.toString());
        System.out.println("Remaining Credit Hours: " + s.getRemainingHours());
    }
}
