public class Candies extends Present_Component{
    private int price;
    private int chocolate_percentage;
    private boolean tasty;
    public Candies(float weight, int price, int chocolate_percentage, boolean tasty) {
        super(weight);
        this.price = price;
        this.chocolate_percentage = chocolate_percentage;
        this.tasty = tasty;
    }

    public float getPrice() {
        return price;
    }

    public int getChocolate_percentage() {
        return chocolate_percentage;
    }

    public boolean getTasty() {
        return tasty;
    }

    @Override
    public String toString() {
        return "" + getClass().getSimpleName() + ": price " + price + ", % of chocolate " + chocolate_percentage + ", is it tasty? " + tasty;
    }

    public String toStringAgain() {
        return "" + getClass().getSimpleName() + " % of chocolate: " +chocolate_percentage;
    }
}
