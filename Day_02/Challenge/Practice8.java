package Day_02.Challenge;
 //Swap two numbers without using a third variable
public class Practice8 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
 
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
    
}
