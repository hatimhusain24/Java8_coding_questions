package Java8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirst5Element {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight");
        List<String> finalList = list.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(finalList);
    }
}
