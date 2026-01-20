package Java8_practice;

import java.util.Arrays;
import java.util.List;

public class SumOfArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of given elements : "+sum);
    }
}