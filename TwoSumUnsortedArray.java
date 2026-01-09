public class TwoSumUnsortedArray {
    public static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                return new int[] {left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        if (result.length > 0){
            System.out.println(result[0] +"->"+arr[result[0]] +" "+ result[1]+"->"+arr[result[1]]);
        }else {
            System.out.println("Pair for two sum of target not found");
        }
    }
}
