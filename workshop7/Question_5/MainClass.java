package workshop7.Question_5;

public class MainClass {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Samsung";
        mobile1.price = 18000;

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Apple";
        mobile2.price = 120000;

        Mobile mobile3 = new Mobile();
        mobile3.brand = "Xiaomi";
        mobile3.price = 19999;

        if (mobile1.isAffordable()) {
            System.out.println(mobile1.brand + " is affordable");
        } else {
            System.out.println(mobile1.brand + " is not affordable");
        }

        if (mobile2.isAffordable()) {
            System.out.println(mobile2.brand + " is affordable");
        } else {
            System.out.println(mobile2.brand + " is not affordable");
        }

        if (mobile3.isAffordable()) {
            System.out.println(mobile3.brand + " is affordable");
        } else {
            System.out.println(mobile3.brand + " is not affordable");
        }
    }
}