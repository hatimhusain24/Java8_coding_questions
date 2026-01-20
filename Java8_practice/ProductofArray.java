package Java8_practice;
import java.util.Arrays;
import java.util.List;

public class ProductofArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,5,6,8,3,9);
        int product = list.stream()
                .reduce(1, (a,b) -> a*b);
        System.out.println("Product of given elements : "+product);
    }
}
