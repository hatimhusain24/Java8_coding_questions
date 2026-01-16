package Java8_practice;

import java.util.Arrays;
import java.util.List;

public class SumofSquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sumOfSquare = list.stream()
                .mapToInt(e -> e*e)
                .sum();
        System.out.println(sumOfSquare);
    }
}
