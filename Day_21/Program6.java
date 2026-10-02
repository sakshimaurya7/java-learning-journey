package Day_21;
import java.util.ArrayList;
import java.util.Scanner;

//Find the largest and smallest element
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        System.out.println("ArrayList : " + list);
        int largest = list.get(0);
        int smallest = list.get(0);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) > largest) {
                largest = list.get(i);
            }
            if(list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }

        System.out.println();
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);

        sc.close();
    }    
}
