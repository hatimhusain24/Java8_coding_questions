package Java_normal;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "reca";
        System.out.println(isAnagram(s1, s2));
    }
    public static boolean isAnagram(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int[] num = new int[26];
        for (int i=0; i<s1.length(); i++){
            num[s1.charAt(i) - 'a']++;
            num[s2.charAt(i) - 'a']--;
        }
        for (int c: num){
            if (c!=0){
                return false;
            }
        }
        return true;
    }
}
