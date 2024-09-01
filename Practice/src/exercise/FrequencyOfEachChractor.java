package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChractor {
    public static void main(String[] args) {
        String str = "Shreyansh";
        // without using java 8
        Map<Character,Integer> map = new HashMap<>();
        for (Character c: str.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        System.out.println(map);


        // with Using java 8
        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()
        )).forEach((k,v)-> System.out.print(k+" : "+v));
    }

}
