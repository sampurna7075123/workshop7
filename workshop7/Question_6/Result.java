package workshop7.Question_6;

public class Result {
    public double subject1;
    public double subject2;
    public double subject3;

    public double totalMarks() {
        return subject1 + subject2 + subject3;
    }

    public double percentage() {
        return (totalMarks() / 300) * 100;
    }

    public void displayResult() {
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total: " + totalMarks());
        System.out.println("Percentage: " + percentage());
    }
}