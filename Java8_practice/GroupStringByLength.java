package Java8_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Cherry","Date","Fig","Grape","Kiwi","Melon");
        Map<Integer, List<String>> num = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(num);
    }
}
