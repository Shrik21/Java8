package exercise;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;

public class SortListInReverseOrder {
    public static void main(String[] args) {
        // Write a program to sort a list in reverse order
        // Hint: Use Collections.reverse() method
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(104);
        list.add(109);
        list.add(109);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
