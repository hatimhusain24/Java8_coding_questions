package Java8_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Flatten the list of lists into a single a stream
public class FlattenArray {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3,4,5),
                Arrays.asList(4,5,6,7,8)
        );
        List<Integer> flattenList = list.stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(flattenList);
    }
}
