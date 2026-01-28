package Java_normal;

import java.util.HashSet;
import java.util.Set;

//Find the length of longest substring without repeating characters
public class LongestSubstringwoRepeatingChar {
    public static void main(String[] args) {
        String str = "aababcabcdabcdeabcdabcaba";
        int left=0, right=0, max=0;
        Set<Character> set = new HashSet<>();
        while (right < str.length()){
            char c = str.charAt(right);
            while (set.contains(c)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);

            if(right - left + 1 > max){
                max = right - left + 1;
            }
            right++;
        }
        System.out.println(max);
    }
}
