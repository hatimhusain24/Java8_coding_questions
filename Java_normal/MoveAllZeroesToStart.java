package Java_normal;

import java.util.Arrays;
//Problem Statement : Move all zeroes to the start
public class MoveAllZeroesToStart {
    public static void main(String[] args) {
        int[] num = {1,0,4,3,0,2,0,5};
        int nonZeroIndex = num.length-1;

        for (int i=num.length-1; i>=0; i--){
            if (num[i] !=0){
                int temp = num[i];
                num[i] = num[nonZeroIndex];
                num[nonZeroIndex] = temp;
                nonZeroIndex--;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
