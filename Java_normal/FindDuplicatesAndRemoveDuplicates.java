package Java_normal;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicatesAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,3,3,4,2};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> distinct = new LinkedHashSet<>();
        for (int num : arr){
            if (!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);

        for (int num : arr){
            distinct.add(num);
        }
        System.out.println(distinct);
    }
}
