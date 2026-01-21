package Java8_practice;

import java.util.Arrays;
import java.util.List;

public class FilterAndAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,12,4,54,9);
        double avg = list.stream()
                .filter(e -> e>10)
                .mapToInt(e -> e)
                .average()
                .orElse(0);
        System.out.println(avg);
    }
}
