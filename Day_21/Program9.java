package Day_21;
import java.util.ArrayList;
import java.util.Scanner;

//Sum and Average of ArrayList
public class Program9 {
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

        int sum = 0;
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        double average = (double) sum / numbers.size();
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        sc.close();
    }
}
