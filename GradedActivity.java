package lab3;

/**
 * Base utility model handling numeric standard score parsing.
 */
public class GradedActivity {
    private double score;

    public void setScore(double s) {
        this.score = s;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }
}
