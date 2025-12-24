package workshop7.question6;

public class MainClass {
    public static void main(String[] args) {
        Result result1 = new Result();
        result1.subject1 = 80;
        result1.subject2 = 75;
        result1.subject3 = 90;

        Result result2 = new Result();
        result2.subject1 = 65;
        result2.subject2 = 70;
        result2.subject3 = 60;

        System.out.println("Result 1");
        result1.displayResult();

        System.out.println();

        System.out.println("Result 2");
        result2.displayResult();
    }
}
