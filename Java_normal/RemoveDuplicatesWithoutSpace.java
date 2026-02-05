package Java_normal;

public class RemoveDuplicatesWithoutSpace {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int finalIndex = removeDuplicates(arr);
        for (int i=0; i < finalIndex; i++){
            System.out.println(arr[i]);
        }
    }
    public static int removeDuplicates(int[] arr){
        if (arr.length == 0){
            return 0;
        }
        int k =0;
        for (int i=1; i<arr.length; i++){
            if (arr[k] != arr[i]){
                k++;
                arr[k] = arr[i];
            }
        }
        return k+1;
    }
}
