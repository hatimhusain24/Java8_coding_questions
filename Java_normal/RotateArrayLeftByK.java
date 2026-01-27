package Java_normal;

import java.util.Arrays;

public class RotateArrayLeftByK {
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,8,7,2,6}; // 26587
        int k = 2;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
