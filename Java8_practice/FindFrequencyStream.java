package Java8_practice;

import java.util.*;
import java.util.stream.Collectors;

public class FindFrequencyStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,3,4,1,4,6);
        Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingBy(n-> n, Collectors.counting()));
        System.out.println(result);

        String str = "FindFrequencyStream";

       Map<Character, Long> result1 = str.toLowerCase().chars()
               .mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(result1);
    }
}
