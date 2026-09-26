package Day_17;

public class Program1 {
    public static void main(String[] args) {
        String name = "Seeta";
        System.out.println("Name : " + name);
        System.out.println("Length : " + name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String a = "Java";
        String b = "Java";
        System.out.println(a.equals(b));
        String c = "JAVA";
        System.out.println(a.equalsIgnoreCase(c));
        String lastName = "Kumari";
        String fullName = name.concat(" ").concat(lastName);
        System.out.println(fullName);

        System.out.println(lastName.substring(2));
        System.out.println(lastName.substring(1,4));

        String sentence = "I am learning Java";
        System.out.println(sentence.contains("Java"));
        System.out.println(sentence.contains("Python"));
    }
}
