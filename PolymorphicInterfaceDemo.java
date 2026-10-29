package lab3;

/**
 * Active testing driver proving multi-tiered grading checks and decoupled interface lookups.
 */
public class PolymorphicInterfaceDemo {

    // Accepts any class implementing the RetailItem contract via interface polymorphism
    public static void showPrice(RetailItem item) {
        System.out.printf("Retail Valuation: $%,.2f\n", item.getRetailPrice());
    }

    public static void main(String[] args) {
        System.out.println("====== LAB 3: INTERFACE POLYMORPHISM DRIVER ======");

        // STEP 1: Academic Relatable Interface Verification
        System.out.println("[Test Phase 1: Comparative Class Matching]");
        FinalExam3 examA = new FinalExam3(50, 5);  // Score: 90.0 (A)
        FinalExam3 examB = new FinalExam3(50, 10); // Score: 80.0 (B)

        System.out.println("Exam A Score: " + examA.getScore() + " | Grade: " + examA.getGrade());
        System.out.println("Exam B Score: " + examB.getScore() + " | Grade: " + examB.getGrade());
        System.out.println("Result -> Exam A > Exam B: " + examA.isGreater(examB));
        System.out.println("Result -> Exam A < Exam B: " + examA.isLess(examB));

        // STEP 2: Decoupled Interface Polymorphism Verification
        System.out.println("\n[Test Phase 2: Decoupled Module Routing]");
        RetailItem commercialMedia = new CompactDisc("Java OOP Masterclass OST", 29.99);
        
        // Pass instance downstream into standard display algorithm
        showPrice(commercialMedia);
        System.out.println("==================================================");
    }
}
