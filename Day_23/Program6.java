package Day_23;
import java.util.HashSet;
import java.util.Scanner;

//Sum and Average of HashSet
public class Program6 {
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
        int sum = 0;
        for(int value : numbers) {
            sum += value;
        }

        double average = (double) sum / numbers.size();
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        sc.close();
    }
}
