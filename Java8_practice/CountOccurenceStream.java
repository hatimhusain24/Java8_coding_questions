package Java8_practice;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurenceStream {
    public static void main(String[] args) {
        String str = "Count all the occurence";
        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
    }
}
