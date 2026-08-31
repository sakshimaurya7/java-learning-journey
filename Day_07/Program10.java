package Day_07;
import java.util.Scanner;

//Character frequency
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            int count = 0;
            for(int k = 0; k < i; k++) {
                if(str.charAt(i) == str.charAt(k)) {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate) {
                continue;
            }

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " = " + count);

        }

        sc.close();
    }
}
