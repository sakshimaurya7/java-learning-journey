package Day_02.Challenge;

//Swap two numbers using a third variable
public class Practice7 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swapping");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
