package Day_23;
import java.util.HashSet;
import java.util.Scanner;

//Largest and Smallest in HashSet
public class Program4 {
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
        int largest = 0;
        int smallest = 0;
        boolean first = true;
        for(int value : numbers) {
            if(first) {
                largest = value;
                smallest = value;
                first = false;
            }
            if(value > largest) {
                largest = value;
            }
            if(value < smallest) {
                smallest = value;
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
        sc.close();
    }
}
