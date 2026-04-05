package Java_normal;

public class RemoveDuplicateSortedArray {
    public static int removeDuplicates(int[] nums){
        int i=0;
        int n=nums.length;
        if (n==0){
            return 0;
        }
        for (int j=1;j<n;j++){
            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2,2,3,3,4,4};
        System.out.println(removeDuplicates(nums));
    }
}
