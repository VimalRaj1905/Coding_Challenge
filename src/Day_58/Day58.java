package Day_58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day58 {

    public static void main(String[] args) {
        String word = "abcde";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char a : word.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }


        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        int ans = 0;
        int t = 0;
        int r = 1;
        for (Map.Entry<Character, Integer> entry : entryList) {
            ans += entry.getValue() * r;
            t++;
            if (t == 8) {
                r += 1;
                t = 0;
            }
        }
        System.out.println(ans);
    }
}
