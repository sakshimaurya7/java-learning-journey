package Day_16;

public class Program2 {
    public static void main(String[] args) {
        int age = 16;
        if(age < 18) {
            throw new ArithmeticException("You are not eligibke to vote.");
        }
        System.out.println("You are eligible to vote.");
    }
}