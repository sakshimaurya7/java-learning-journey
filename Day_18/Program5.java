package Day_18;

public class Program5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like Python.");
        sb.replace(7, 13, "Java");
        System.out.println(sb);
    }
}
