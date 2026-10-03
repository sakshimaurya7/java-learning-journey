package Day_22;
import java.util.LinkedList;
import java.util.Scanner;

public class Program11 {
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
        System.out.println("LinkedList : " + list);
        System.out.println();
        System.out.println("First element : " + list.getFirst());
        System.out.println("Last element : " + list.getLast());
        int largest = list.get(0);
        int smallest = list.get(0);
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if(list.get(i)  > largest) {
                largest = list.get(i);
            }
            if(list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }

        double average = (double) sum / list.size();
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        System.out.println();
        System.out.print("Enter number to search : ");
        int search = sc.nextInt();
        boolean found = list.contains(search);

        if(found) {
            System.out.println(search + " is present in the LinkedList.");
        }
        else {
            System.out.println(search + " is not present in the LinkedList.");
        }

        System.out.println();
        System.out.println("Size : " + list.size());
        sc.close();
    }
}