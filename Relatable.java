package lab3;

/**
 * Specifies a behavioral contract to run structural comparisons against items.
 */
public interface Relatable {
    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
}
