package Java_normal;

//Find the missing number from 1 to n
public class MissingNumber {
    public static void main(String[] args) {
        int[] num = {1,2,3,5,6};
        int N = num.length + 1;
        int expectedSum = N * (N+1)/2;
        int actualSum=0;
        for (int j : num){
            actualSum += j;
        }
        System.out.println(expectedSum-actualSum);
    }
}
