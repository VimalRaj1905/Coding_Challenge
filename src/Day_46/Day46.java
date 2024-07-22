package Day_46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day46 {
    public static void main(String[] args) {
        Day46 day46 = new Day46();
        String[] names = {"John", "Alice", "Bob"};
        int[] heights = {5, 6, 7};
        String[] result = day46.sortPeople(names, heights);
        for (String name : result) {
            System.out.println(name);
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> mapping = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            mapping.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < n / 2; ++i) {
            int temp = heights[i];
            heights[i] = heights[n - 1 - i];
            heights[n - 1 - i] = temp;
        }
        for (int i = 0; i < n; ++i) {
            names[i] = mapping.get(heights[i]);
        }
        return names;
    }
}
