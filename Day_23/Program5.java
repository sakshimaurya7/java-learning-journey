package Day_23;
import java.util.HashSet;
import java.util.Scanner;

//Count Even and Odd Numbers
public class Program5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println();
        System.out.println("HashSet : " + numbers);
        System.out.println();

        int countEven = 0;
        int countOdd = 0;
        for(int value : numbers) {
            if(value % 2 == 0) {
                countEven++;
            }
            else {
                countOdd++;
            }
        }
        System.out.println("Even numbers : " + countEven);
        System.out.println("Odd numbers : " + countOdd);
        sc.close();
    }
}
