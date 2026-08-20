package Day_05;

public class Program10 {
    static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return originalNumber == reverse;
        // if (originalNumber == reverse) {
        //     return true;
        // }
        // else {
        //     return false;
        // }
    }  
    public static void main(String[] args) {
        int number = 123;
        System.out.println("Original Number : " + number);
        System.out.println("Is Palindrome : " + isPalindrome(number));
    }  
}
