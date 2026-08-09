package Day_02.Challenge;
import java.util.Scanner;

//Convert Celcius to Fahrenheit
public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int celcius = sc.nextInt();
        
        double fahrenheit = ( celcius * 1.8 ) + 32;

        System.out.println("Convert Celcius to Fahrenheit : ");
        System.out.println(" From " + celcius + " celcius to " + fahrenheit + "F");

        sc.close();
    }
}
