package Day_02.Challenge;
import java.util.Scanner;
 
//Create an interactive report card where the user enters marks and your program calculates the total and average

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter English subject marks: ");
        float engMarks = sc.nextFloat();

        System.out.println("Enter Maths subject marks : ");
        float mathMarks = sc.nextFloat();

        System.out.println("Enter Science subject marks : ");
        float sciMarks = sc.nextFloat();

        System.out.println("Enter History subject marks : ");
        float hisMarks = sc.nextFloat();

        System.out.println("Enter Hindi subject marks : ");
        float hindiMarks = sc.nextFloat();

        System.out.println("=====================================");
        System.out.println("Report Card");
        System.out.println("=====================================");
        System.out.println("English : " + engMarks);
        System.out.println("Maths : " + mathMarks);
        System.out.println("Science : " + sciMarks);
        System.out.println("History : " + hisMarks);
        System.out.println("Hindi : " + hindiMarks);

        float total = engMarks + mathMarks + sciMarks + hisMarks + hindiMarks;

        System.out.println("Total Marks : " + total);

        float average = total/5f;

        System.out.println("Average Marks : " + average);
        
        float percentage = total/5;

        System.out.println("Percentage : " + percentage + "%");
        
        sc.close();
    }    
}
