package Day_04;

//Print Odd Numbers 1-50
public class Program4 {
    public static void main(String[] args) {
        int i;
        for ( i = 1 ; i <= 50 ; i++) {
            if ( i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
