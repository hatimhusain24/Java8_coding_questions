package Java8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementWith1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "12", "20", "45", "132");
        List<String> finalList = list.stream()
                .filter(e -> e.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(finalList);
    }
}
