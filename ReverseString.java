//Problem statement : Reverse a string without using any built-in functions
public class ReverseString {
    public static void main(String[] args) {
        String str = "encylopedia";
        int left=0;
        int right=str.length()-1;
        char[] arr = str.toCharArray();

        while (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(arr);
        System.out.println(reversed);
    }
}
