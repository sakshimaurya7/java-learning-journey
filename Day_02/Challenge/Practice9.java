package Day_02.Challenge;
import java.util.Scanner;

//Calculate Simple Interest
public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle amount ( the initial sum of money): ");
        int principalAmt = sc.nextInt();

        System.out.println("Enter annual interest rate ( in percentage ) : ");
        int interestRate = sc.nextInt();

        System.out.println("Enter Time period (in years) : ");
        int timePeriod = sc.nextInt();

        double simpleInterest = (principalAmt * interestRate * timePeriod)/100;

        System.out.println("The total interest is : " + simpleInterest);

        System.out.println("The Total amount is : " + (principalAmt + simpleInterest));

        sc.close();
    }
}
