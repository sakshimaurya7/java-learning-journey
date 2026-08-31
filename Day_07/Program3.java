package Day_07;
import java.util.Scanner;

//Count Vowels
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            for(int j = 0; j < vowels.length(); j++) {
                if(input.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }

        System.out.println("Vowels : " + count);

        sc.close();
    }
}
