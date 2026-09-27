package Day_18;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.print("Enter an index value : ");
        int index = sc.nextInt();

        sb.deleteCharAt(index);
        System.out.println(sb);

        sc.close();
    }    
}
