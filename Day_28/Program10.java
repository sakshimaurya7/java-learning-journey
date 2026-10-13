package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//Mini Project: Browser History
public class Program10 {
    public static void main(String[] args) {
        Deque<String> apps = new ArrayDeque<>();
        apps.addLast("Google");
        apps.addLast("YouTube");
        apps.addLast("GitHub");
        System.out.println("Browser History : " + apps);
        System.out.println("Current Page : " + apps.peekLast());
        System.out.println("Going back from : " + apps.removeLast());
        System.out.println("Current Page after going back : " + apps.peekLast());
        System.out.println("Updated History : " + apps);
        System.out.println("Total pages in History : " + apps.size());
    }
}
