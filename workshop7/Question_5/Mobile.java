package workshop7.Question_5;

public class Mobile {
    public String brand;
    public double price;

    public boolean isAffordable() {
        if (price < 20000) {
            return true;
        } else {
            return false;
        }
    }
}