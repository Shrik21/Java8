package exercise;

import java.util.ArrayList;
import java.util.List;

public class SeparateOddEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(35);
        list.add(41);
        list.add(54);

      List<Integer> evenNumbers = list.stream().filter(n->n%2==0).toList();
      List<Integer> oddNumbers = list.stream().filter(n->n%2!=0).toList();

      System.out.println("Even numbers: "+evenNumbers);
      System.out.println("Odd numbers: "+oddNumbers);


    }
}
