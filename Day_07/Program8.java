package Day_07;
import java.util.Scanner;

//Remove Spaces
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String str = sc.nextLine();
        System.out.println("New String : " + str.replace(" ", ""));

        sc.close();
    }
}
