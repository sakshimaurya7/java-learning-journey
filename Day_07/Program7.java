package Day_07;
import java.util.Scanner;

//Count a Particular Character
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String : ");
        String str = sc.nextLine();

        System.out.print("Character : ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(ch + " occurs " + count + " times.");

        sc.close();
    }
}
