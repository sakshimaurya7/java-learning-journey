package Day_03;
import java.util.Scanner;

//Grade Calculator
public class Program6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks : ");
        int marks = sc.nextInt();

        if ( marks >= 90 && marks <= 100) {
            System.out.println("A+ Grade");
        }
        else if ( marks >= 80 && marks <= 89) {
            System.out.println("A Grade");
        }
        else if ( marks >= 70 && marks <= 79) {
            System.out.println("B Grade");
        }
        else if ( marks >= 60 && marks <= 69) {
            System.out.println("C Grade");
        }
        else if ( marks < 60 && marks > 0) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Enter valid marks");
        }

        sc.close();
    }
}
