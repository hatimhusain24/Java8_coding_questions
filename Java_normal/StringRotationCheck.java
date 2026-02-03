package Java_normal;

public class StringRotationCheck {
    public static boolean isRotationOfString(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        String concatenate = str1 + str1;
        return concatenate.contains(str2);
    }
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "BACD";

        if (isRotationOfString(str1, str2)){
            System.out.println("It is rotation");
        }else {
            System.out.println("It is not a rotation");
        }
    }
}
