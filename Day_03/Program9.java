package Day_03;
import java.util.Scanner;

//Simple Calculator
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter Operator (+,-,*,/,%) : ");
        String operator = sc.next();

        switch (operator) {
            case "+" :
                int sum = num1 + num2;
                System.out.println("Result : " + sum);
                break;
            case "-" :
                int sub = num1 - num2;
                System.out.println("Result : " + sub);
                break;
            case "*" :
                int multiply = num1 * num2;
                System.out.println("Result : " + multiply);
                break;
            case "/" :
                int division = num1 / num2;
                System.out.println("Result : " + division);
                break;
            case "%" :
                int remainder = num1 % num2;
                System.out.println("Result : " + remainder);
                break;
            default :
                System.out.println("Invalid Operator! Please enter a valid operator.");
        }

        sc.close();
    }
}
