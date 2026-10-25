public class GradeDemo {
    public static void main(String[] args) {
        // Create a curved activity with a 6% curve (1.06)
        CurvedActivity activity = new CurvedActivity(1.06);

        // Set the raw score to 87
        activity.setScore(87.0);

        // Print out the details using simple text concatenation
        System.out.println("Raw score: " + activity.getRawScore());
        System.out.println("Curved score: " + activity.getScore());
        System.out.println("Final grade: " + activity.getGrade());
    }
}

