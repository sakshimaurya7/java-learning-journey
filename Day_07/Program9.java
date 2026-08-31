package Day_07;
import java.util.Scanner;

//Find Duplicate Characters
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String str = sc.nextLine();
        
        for(int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            for(int k = 0; k < i; k++) {
                if(str.charAt(i) == str.charAt(k)) {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate) {
                continue;
            }
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i) + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}
