package Java8_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AIListPracticeQuestions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 6);
        List<String> list = Arrays.asList("Java", "Spring", "API", "Angular");

//      Filter a list of integers to get only even numbers
        List<Integer> even = numbers.stream().filter(n-> n%2==0).toList();
//      Filter a list of integers to get only odd numbers
        List<Integer> odd = numbers.stream().filter(n->n%2 !=0).toList();
//        Convert a list of strings to uppercase
        List<String> str = list.stream().map(String::toUpperCase).toList();
//        Count how many strings contain a certain character
        List<String> str1 = list.stream().filter(s-> s.toLowerCase().contains("a")).toList();
//        Convert a list of strings to a list of lengths
        List<Integer> numList = list.stream().map(String::length).toList();
//        Find the average of a list of integers.
        numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
//        Find sum of numbers greater than a threshold.
        numbers.stream().filter(n->n > 3).mapToInt(Integer::intValue).sum();
//        Find the maximum and minimum element in a list.
        numbers.stream().max(Integer::compareTo).get();
        numbers.stream().min(Integer::compareTo).get();
//        Count frequency of each element in a list.
        list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//        Sum of squares / cubes of numbers
        int squareSum = numbers.stream().map(n-> n*n).reduce(0, Integer::sum);
        int cubeSum = numbers.stream().map(n -> n*n*n).reduce(0, Integer::sum);
        System.out.println(squareSum +" "+ cubeSum);

//        Sort a list of integers in ascending / descending order.
        List<Integer> ascList = numbers.stream().sorted().toList();
        List<Integer> descList = numbers.stream().sorted(Comparator.reverseOrder()).toList();

//        Sort a list of strings alphabetically / by length
        List<String> alph = list.stream().sorted().toList();
        List<String> len = list.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(len);

//        Find the second largest number in a list
        int second = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(second);

        int k=4;
        int kth = numbers.stream().distinct().sorted().skip(k-1).findFirst().orElseThrow();
        System.out.println(kth);
//        Remove duplicates while preserving order
        numbers.stream().distinct().toList();
//        Partition a list into even and odd using partitioningBy
        numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
//        Count strings with a certain condition (prefix / substring)
        list.stream().filter(s-> s.startsWith("A")).count();
        list.stream().filter(s-> s.contains("av")).count();
//        Group elements by a key (e.g., length, category)
        list.stream().collect(Collectors.groupingBy(String::length));
//        Find intersection of two lists
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2,3, 4, 6);
        Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        List<Integer> intersection = list1.stream().filter(list2::contains).toList();
        System.out.println(intersection);

//        Count number of words using groupingBy
        String sentence = "java is java and stream is powerful";
        Map<String, Long> map = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(s->s, Collectors.counting()));
        System.out.println(map);
    }
}
