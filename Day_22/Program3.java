package Day_22;
import java.util.LinkedList;
import java.util.Scanner;

//LinkedList with user input
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        System.out.println("LinkedList : " + list);
        System.out.println();
        System.out.print("Enter number to search : ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == search) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println(search +" present in the LinkedList.");
        } 
        else {
            System.out.println(search +" not found in the LinkedList.");
        }
        System.out.println();
        System.out.println("Size : "  + list.size());
        sc.close();
    }
}
