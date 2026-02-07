package Java8_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,3,5,3,2,6);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
