package Day_25;

import java.util.HashMap;
import java.util.Map;

public class Day25 {
    public static void main(String[] args) {
        int [][] arr = {{1,2},{2,3},{4,2}};
        System.out.println(new Day25().findCenter(arr));

    }
    public int findCenter(int[][] edges) {
        if (edges == null) return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] edge : edges) {
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == edges.length) return key;
        }
        return 0;
    }
}
