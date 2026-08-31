package Day_07.MiniProject;
import java.util.Scanner;

//It should take name of the user and display the name, length, first and last character, in uppercase and lowercase, number of vowels and number of consonents
public class StudentNameAnalyzer {

    static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < vowels.length(); j++) {
                if(str.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    static int countConsonants(String str) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < consonants.length(); j++) {
                if(str.charAt(i) == consonants.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        if(name.isEmpty()) {
            System.out.println("Name cannot be empty.");
        }
        else {
            System.out.println("Name            : " + name);
            System.out.println("Length          : " + name.length());
            System.out.println("First Character : " + name.charAt(0));
            System.out.println("Last Character  : " + name.charAt(name.length()-1));
            System.out.println("Uppercase       : " + name.toUpperCase());
            System.out.println("Lowercase       : " + name.toLowerCase());
            System.out.println("Vowels          : " + countVowels(name));
            System.out.println("Consonants      : " + countConsonants(name));
        }

        sc.close();
    }
}
