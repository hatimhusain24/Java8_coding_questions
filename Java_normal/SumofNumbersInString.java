package Java_normal;

public class SumofNumbersInString {
    public static void main(String[] args) {
        String str = "a1b2c3d4e5";
        int sum = 0;
        for (int i=1; i<str.length(); i = i+2){
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
