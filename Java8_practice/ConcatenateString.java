package Java8_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Concatenate a list of strings into a single string, seperated by commas
public class ConcatenateString {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Apple","Ball","Cat");
        String str = strList.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);
    }
}
