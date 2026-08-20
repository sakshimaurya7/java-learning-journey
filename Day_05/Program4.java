package Day_05;

public class Program4 {
    static boolean isEven(int number) {
        if ( number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isEven(7));
    }
}