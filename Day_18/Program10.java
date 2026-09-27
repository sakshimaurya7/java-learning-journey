package Day_18;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.append(" Programming");
        sb.reverse();
        System.out.println("Reversed String : " + sb);
        sc.close();
    }    
}
