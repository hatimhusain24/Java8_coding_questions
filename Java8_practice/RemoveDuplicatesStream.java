package Java8_practice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,4,5,3);
        List<Integer> result = list.stream()
                .distinct()
                .toList();
        System.out.println(result);
    }
}
