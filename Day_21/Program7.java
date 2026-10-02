package Day_21;
import java.util.ArrayList;
import java.util.Scanner;

//Reverse an ArrayList
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println();
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        System.out.println("ArrayList : " + list);
        System.out.println();

        ArrayList<Integer> reversedList = new ArrayList<>();
        for(int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println("Reversed ArrayList : " + reversedList);
        sc.close();
    }
}
