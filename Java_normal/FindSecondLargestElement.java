package Java_normal;

//find the second largest distinct element in the array
public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 12, 7, 4, 15, 13};

        if (arr.length < 2){
            System.out.println(-1);
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println(-1);
        } else {
            System.out.println(secondLargest);
        }
    }
}
