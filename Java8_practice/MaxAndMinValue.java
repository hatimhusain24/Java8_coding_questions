package Java8_practice;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,6,9,8,1,5);
        int max = list.stream().max(Integer::compareTo).get();
        int min = list.stream().min(Integer::compareTo).get();
        System.out.println(max +" "+min);
    }
}
