/**
 * Abstract Superclass representing a generic Student.
 * Serves as a contract for specialized student types.
 */
public abstract class Student {
    private String name;
    private String idNumber;
    private int yearAdmitted;

    public Student(String n, String id, int year) {
        this.name = n;
        this.idNumber = id;
        this.yearAdmitted = year;
    }

    public String getName() { return name; }
    public String getIdNumber() { return idNumber; }
    public int getYearAdmitted() { return yearAdmitted; }

    @Override
    public String toString() {
        return "Name: " + name + "\nID: " + idNumber + "\nYear: " + yearAdmitted;
    }

    // Abstract Method - Must be overridden by concrete subclasses!
    public abstract int getRemainingHours();
}
