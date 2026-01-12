import java.util.HashMap;
import java.util.Map;

public class CharacterCountOccurence {
    public static void main(String[] args) {
        String str = "Character2026";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toLowerCase().toCharArray()){
            if (Character.isLetter(c)){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
    }
}
