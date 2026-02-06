package Java_normal;

import java.util.Scanner;

public class StringSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s :");
        String s = sc.nextLine();
        System.out.println("Enter the string t :");
        String t = sc.nextLine();
        System.out.println(isSubsequence(s, t));
    }
    private static boolean isSubsequence(String s, String t){
        //2 pointer approach
        int i=0,j=0;
        while (i<s.length() && j<t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
