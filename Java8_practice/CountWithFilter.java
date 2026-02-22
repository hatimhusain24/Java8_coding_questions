package Java8_practice;

import java.util.Arrays;
import java.util.List;

public class CountWithFilter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Actor","Banana","Ice");
        long count = list.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(count);
    }
}
