package Day_15;

public class Program2 {
    public static void main(String[] args) {
        try {
            int[] array = {10,20,30,40};
            System.out.println(array[4]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }    
}
