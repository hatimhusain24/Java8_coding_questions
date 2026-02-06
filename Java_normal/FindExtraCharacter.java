package Java_normal;

public class FindExtraCharacter {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char c = extraCharacter(s, t);
        System.out.println(c);
    }
    public static char extraCharacter(String s, String t){
        int x =0;
        for (char c : (s+t).toCharArray()){
            x ^= c;
            // a^a = 0
            // a^0 = a
        }
        return (char) x;
    }
}
