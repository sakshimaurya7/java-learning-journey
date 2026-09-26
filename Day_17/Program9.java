package Day_17;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine();
        
        System.out.print("Enter word to search : ");
        String search = sc.nextLine();

        if(sentence.contains(search)) {
            System.out.println("Word found.");
        }
        else {
            System.out.println("Word not found.");
        }

        sc.close();
    }    
}
