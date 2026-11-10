package Day_34;
import java.util.ArrayList;
import java.util.HashSet;
//Find the common elements and unique elements between two lists
public class Program5 {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(70);
        list2.add(80);
        list2.add(90);

        System.out.println("List 1 : " + list1);
        System.out.println("List 2 : " + list2);

        System.out.println();
        ArrayList <Integer> commonElements = new ArrayList<>();
        for(Integer num : list1) {
            if(list2.contains(num)) {
                commonElements.add(num);
            }
        }
        System.out.println("Common Elements : " + commonElements);

        System.out.println();
        System.out.println("Only in List 1 : " + list1.stream().filter(num -> !list2.contains(num)).toList());
        System.out.println();
        System.out.println("Only in List 2 : " + list2.stream().filter(num -> !list1.contains(num)).toList());
        System.out.println();

        HashSet <Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        System.out.println("Union of Both Lists : " + unionSet);
    }
}
