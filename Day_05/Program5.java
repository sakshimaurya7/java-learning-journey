package Day_05;

public class Program5 {
    static int largest(int a, int b) {
        if ( a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Largest = " + largest(50,30));
    }
}
