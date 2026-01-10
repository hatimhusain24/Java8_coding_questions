import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "India is a great country";
        String[] arr = str.trim().split("\\s+");
        StringBuilder stb = new StringBuilder();
        for (int i= arr.length-1; i >=0; i--){
            stb.append(arr[i]);
            if (i!=0){
                stb.append(" ");
            }
        }
        System.out.println(stb);
    }
}
