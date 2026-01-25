package Java8_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//find 'second highest number' from the array
public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,8,12,15,45);
        Optional<Integer> secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondHighest.ifPresent(System.out::println);
    }
}
