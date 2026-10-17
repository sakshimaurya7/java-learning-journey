package Day_32;
import java.util.ArrayList;

//Separate Even and Odd numbers using ArrayList
public class Program4 {
    public static void main(String[] args) {
        int[] list = {12, 7, 18, 5, 21, 30, 9, 14, 11, 16};

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (Integer num : list) {
            if(num % 2 == 0) {
                evenList.add(num);
            }
            else {
                oddList.add(num);
            }
        }

        System.out.println("Even numbers : ");
        System.out.println(evenList);
        System.out.println();
        System.out.println("Odd numbers : ");
        System.out.println(oddList);
        System.out.println();
        System.out.println("Total even numbers : " + evenList.size());
        System.out.println("Total odd numbers : " + oddList.size());
    }
}
