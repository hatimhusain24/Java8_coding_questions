package Java_normal;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "Character";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toLowerCase().toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
