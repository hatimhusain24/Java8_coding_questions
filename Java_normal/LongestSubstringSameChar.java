package Java_normal;

public class LongestSubstringSameChar {
    public static void main(String[] args) {
        String str = "abbcccdde";
        int count=1, max=1;
        for (int i=1; i<str.length(); i++){
            if (str.charAt(i) == str.charAt(i-1)){
                count++;
                max = Math.max(count, max);
            }else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}
