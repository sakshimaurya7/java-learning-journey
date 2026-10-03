package Day_22;
import java.util.LinkedList;
import java.util.Scanner;

//Sum and Average of LinkedList
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }   
        double average = (double) sum / list.size();

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        sc.close();
    }
}