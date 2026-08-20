package Day_05;

public class Program6 {
    static int largest(int a, int b, int c) {
        if ( a > b && a > c) {
            return a;
        }
        else if ( b > c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println("Largest = " + largest(10, 25, 15));
    }
}
