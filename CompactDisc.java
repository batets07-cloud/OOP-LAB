package lab3;

/**
 * Implements RetailItem behaviors independently of the academic tracking hierarchy.
 */
public class CompactDisc implements RetailItem {
    private String title;
    private double price;

    public CompactDisc(String t, double p) {
        this.title = t;
        this.price = p;
    }

    public String getTitle() { return title; }

    @Override
    public double getRetailPrice() {
        return price;
    }
}
