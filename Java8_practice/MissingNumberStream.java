package Java8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumberStream {
    public static void main(String[] args) {
        int[] arr = {1,3,6,5,9,3,1};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        Set<Integer> set = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());
        List<Integer> finalList = IntStream.rangeClosed(min,max)
                .boxed()
                .filter(e -> !set.contains(e))
                .toList();
        System.out.println(finalList);
    }
}
