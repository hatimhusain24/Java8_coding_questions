package Java8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNullValuesFromList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", null, "Three", null, null, "Four");
        List<String> filtered = list.stream()
                .filter(e -> e!=null)
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
