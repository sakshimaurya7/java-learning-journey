package Day_07;

public class Practice {
    public static void main(String[] args) {
        String name = "Shikha";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        for(int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }

        String a = "Java";
        String b = "Java";
        if( a == b) {
            System.out.println("\nMAtching");
        }
        else {
            System.out.println("\nNot matching");
        }

        System.out.println(a.equals(b));

        String c = "JAVA";
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(name.toUpperCase());
        System.out.println(b.toLowerCase());

        String Sentence = " I am learning Java";
        System.out.println(Sentence.contains("Java"));
        System.out.println(Sentence.contains("Python"));
        System.out.println(name.substring(0,3));

    }
}
