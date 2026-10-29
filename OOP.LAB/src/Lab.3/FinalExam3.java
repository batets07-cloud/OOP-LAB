package lab3;

/**
 * Represents a final examination grading object.
 * Extends academic behaviors from GradedActivity while implementing Relatable.
 */
public class FinalExam3 extends GradedActivity implements Relatable {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam3(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / questions;
        
        // Populate score into structural parent property
        setScore(100.0 - (missed * pointsEach));
    }

    @Override
    public boolean equals(GradedActivity g) {
        return this.getScore() == g.getScore();
    }

    @Override
    public boolean isGreater(GradedActivity g) {
        return this.getScore() > g.getScore();
    }

    @Override
    public boolean isLess(GradedActivity g) {
        return this.getScore() < g.getScore();
    }
}
