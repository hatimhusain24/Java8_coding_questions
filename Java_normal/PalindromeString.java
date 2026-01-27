package Java_normal;

import java.util.Scanner;

public class PalindromeString {
    public static boolean Palindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isPalindrome = Palindrome(str);
        if (isPalindrome){
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }
}
