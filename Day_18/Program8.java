package Day_18;

public class Program8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(0, "Java ");
        sb.replace(11, 17, "Programming");
        System.out.println(sb);
    }
}