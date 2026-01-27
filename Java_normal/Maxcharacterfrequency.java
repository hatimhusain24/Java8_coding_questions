package Java_normal;

import java.util.HashMap;
import java.util.Map;

public class Maxcharacterfrequency {
    public static void main(String[] args) {
        String str = "Charrracter2026";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toLowerCase().toCharArray()){
            if (Character.isLetter(c)){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        int maxNo = 0;
        char maxc = '\0';
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() +" "+entry.getValue());
            if (entry.getValue() > maxNo){
                maxNo= entry.getValue();
                maxc = entry.getKey();
            }
        }
        System.out.println(maxNo +":"+maxc);
    }
}

