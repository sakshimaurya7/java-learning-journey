package Day_07;
import java.util.Scanner;

//Count Constants
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();
        String constant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            for(int j = 0; j < constant.length(); j++) {
                if(input.charAt(i) == constant.charAt(j)) {
                    count++;
                }
            }
        }

        System.out.println("Constants : " + count);

        sc.close();
    }
}
