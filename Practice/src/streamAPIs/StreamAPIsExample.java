package streamAPIs;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamAPIsExample {
    public static void main(String[] args) {
        // Create a stream of integers from 1 to 10
        // This creates a stream of integers from 1 to 10
        // The range method is a static method of the IntStream interface
        // The range method takes two arguments: the starting value and the ending value
        // The range method returns a stream of integers from the starting value to the ending value
        // The range method is a terminal operation, so it returns a stream of integers
        // The forEach method is a terminal operation, so it returns void
       // java.util.stream.IntStream.range(1, 11).forEach(System.out::println);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //list.stream().filter(n->n%2==0).forEach(System.out::println);

        list.stream().map(n->n*3).filter(n->n%2==0).forEach(System.out::println);

        list.stream().filter(n->n%2==0).map(n->n*3).forEach(System.out::println);

        list.stream().toList().forEach(System.out::println);

        //write an example to use reduce.
        int sum = list.stream().reduce(0, (a,b)->a+b);
        System.out.println("Sum : "+sum);
    }
}
