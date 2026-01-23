package Java8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CovertListIntoMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana","Apple","Mango","Guava");
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(str -> str, String::length));
        System.out.println(map);
    }
}
