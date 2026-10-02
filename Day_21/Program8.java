package Day_21;
import java.util.ArrayList;
import java.util.Scanner;

//Count even and odd numbers
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println();
        System.out.println("ArrayList : " + numbers);

        System.out.println();
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
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
