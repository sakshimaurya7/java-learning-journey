package Day_07;
import java.util.Scanner;

//Check Palindrome
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse : " + reverse);
        if(str.equals(reverse)){
            System.out.println(str + " is Palindrome");
        }
        else {
            System.out.println(str + " not a Palindrome");
        }

        sc.close();
    }
}
