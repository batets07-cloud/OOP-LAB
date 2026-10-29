/**
 * Concrete Subclass representing a Computer Science Student.
 * Implements the remaining hours calculation contract.
 */
public class CompSciStudent extends Student {
    private final int MATH_HOURS = 20;
    private final int CS_HOURS = 40;
    private final int GEN_ED_HOURS = 60;

    private int mathHours;
    private int csHours;
    private int genEdHours;

    public CompSciStudent(String n, String id, int year) {
        super(n, id, year); // Explicit call to superclass constructor
    }

    public void setMathHours(int math) { this.mathHours = math; }
    public void setCsHours(int cs) { this.csHours = cs; }
    public void setGenEdHours(int genEd) { this.genEdHours = genEd; }

    @Override
    public int getRemainingHours() {
        int reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
        return reqHours - (mathHours + csHours + genEdHours);
    }
}
