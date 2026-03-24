package Java_normal;

public class StringWhiteSpaceRemoval {
    public static void main(String[] args) {
        String str = "Java backend  developer       need to             " +
                "        advanced and    skilled up          in  AI      fields.";
        String s2 = str.replaceAll("\\s+", " ").trim();
        System.out.println(s2);
    }
}
