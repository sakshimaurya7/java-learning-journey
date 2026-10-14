package Day_29;
import java.util.PriorityQueue;
import java.util.Scanner;

//PriorityQueue with User Input
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        PriorityQueue<Integer> list = new PriorityQueue<>();
        System.out.println("Enter " + n + " numbers : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.offer(value);         
        }        

        System.out.println();
        System.out.println("Numbers in priority order : ");
        while(!list.isEmpty()) {
            System.out.println(list.poll());
        }

        sc.close();
    }
}
