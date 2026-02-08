package Java8_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListAscDesc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,5,6,2,9,8);
        List<Integer> resultInAsc = list.stream()
                .sorted()
                .toList();
        System.out.println("List sorted in ascending order : "+ resultInAsc);

        List<Integer> resultInDesc = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("List sorted in descending order : "+resultInDesc);
    }
}
