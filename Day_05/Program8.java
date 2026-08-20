package Day_05;

public class Program8 {
    static boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }
        for (int i =2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
    }
}
