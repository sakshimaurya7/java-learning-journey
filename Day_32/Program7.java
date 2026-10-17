package Day_32;
import java.util.ArrayList;
import java.util.HashSet;

//Remove Duplicate words from a list
public class Program7 {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<>();
        language.add("Java");
        language.add("Python");
        language.add("Java");
        language.add("C++");
        language.add("Python");
        language.add("JavaScript");

        System.out.println("Original List : ");
        System.out.println(language);
        System.out.println();

        HashSet<String> uniqLang = new HashSet<>();
        uniqLang.addAll(language);

        System.out.println("Unique Words : ");
        System.out.println(uniqLang);
    }
}
