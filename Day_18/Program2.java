package Day_18;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, "Java");
        System.out.println(sb);
        sc.close();
    }
}