import java.util.HashMap;
import java.util.Map;

public class TwoSumSortedArray {
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< arr.length; i++){
            int needed = target-arr[i];
            if (map.containsKey(needed)){
                return new int[]{map.get(needed), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 10;
        int[] result = twoSum(arr, target);
        if (result.length > 0){
            System.out.println(result[0]+" "+ result[1]);
        }else {
            System.out.println("Pair for two sum of target not found");
        }
    }
}
