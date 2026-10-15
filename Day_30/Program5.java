package Day_30;
// import java.util.HashMap;
// import java.util.Map;

//Count Even and Odd Elements
public class Program5 {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30, 15, 10, 35};
        int countEven = 0;
        int countOdd = 0;
        for (int i : array) {
            if(i % 2 == 0) {
                countEven++;
            }
            else {
                countOdd++;
            }
        }

        System.out.println("Even elements count : " + countEven);
        System.out.println("Odd elements count : " + countOdd);
    }
}
