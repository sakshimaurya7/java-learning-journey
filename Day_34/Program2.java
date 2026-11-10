package Day_34;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

//Find the Most Frequent word using HashMap
public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("Java");
        words.add("C++");
        words.add("Python");
        words.add("Java");
        words.add("HTML");
        words.add("Python");
        words.add("Java");

        HashMap<String, Integer> wordCount = new HashMap<>();
        for(String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies : ");
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.print("Most Frequent Word : ");
        String mostFrequentWord = null;
        int maxCount = 0;
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }   
        }

        System.out.println(mostFrequentWord);
        System.out.println("Frequency : " + maxCount);
    }
}
