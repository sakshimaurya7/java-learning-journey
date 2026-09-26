package Day_17;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter character : ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("Character '" + ch + "' occurs " + count +  " times.");

        sc.close();

    }    
}
