package Java8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionIntoOddEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors.partitioningBy(e-> e%2==0));
        List<Integer> even = map.get(true);
        List<Integer> odd = map.get(false);
        System.out.println(even +" "+ odd);
    }
}
