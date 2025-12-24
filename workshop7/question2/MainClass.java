package workshop7.question2;

public class MainClass {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 10;
        rectangle1.breadth = 5;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 7;
        rectangle2.breadth = 3;

        System.out.println("Rectangle 1");
        System.out.println("Length: " + rectangle1.length);
        System.out.println("Breadth: " + rectangle1.breadth);
        System.out.println("Area: " + (rectangle1.length * rectangle1.breadth));

        System.out.println();

        System.out.println("Rectangle 2");
        System.out.println("Length: " + rectangle2.length);
        System.out.println("Breadth: " + rectangle2.breadth);
        System.out.println("Area: " + (rectangle2.length * rectangle2.breadth));
    }
}
