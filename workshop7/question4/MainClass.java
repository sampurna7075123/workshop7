package workshop7.question4;

public class MainClass {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", 8, 85000);
        Laptop laptop2 = new Laptop("HP", 16, 105000);
        Laptop laptop3 = new Laptop("Lenovo", 12, 95000);

        if (laptop1.RAM > 8) {
            System.out.println(laptop1.brand);
            System.out.println(laptop1.RAM);
            System.out.println(laptop1.price);
            System.out.println();
        }

        if (laptop2.RAM > 8) {
            System.out.println(laptop2.brand);
            System.out.println(laptop2.RAM);
            System.out.println(laptop2.price);
            System.out.println();
        }

        if (laptop3.RAM > 8) {
            System.out.println(laptop3.brand);
            System.out.println(laptop3.RAM);
            System.out.println(laptop3.price);
            System.out.println();
        }
    }
}