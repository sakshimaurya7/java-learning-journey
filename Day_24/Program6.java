package Day_24;
import java.util.TreeSet;
import java.util.Scanner;

//Sum and Average 
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println();
        TreeSet<Integer> list = new TreeSet<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        System.out.println("TreeSet : " + list);
        System.out.println();

        int sum = 0;
        for(int value : list) {
            sum += value;
        }
        double average = (double) sum / list.size();
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        sc.close();
    }
}