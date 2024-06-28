package Day_26;
import java.util.Arrays;
import java.util.Comparator;

public class Day26 {
    public static void main(String[] args) {
        int [][] arr = {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};
        int n = 5;;
        System.out.println(new Day26().maximumImportance(n,
                arr));

    }
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];


        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }


        Integer[] cities = new Integer[n];
        for (int i = 0; i < n; i++) {
            cities[i] = i;
        }
        Arrays.sort(cities, new Comparator<Integer>() {
            private Integer a;
            private Integer b;

            public int compare(Integer a, Integer b) {
                this.a = a;
                this.b = b;
                return Integer.compare(degree[b], degree[a]);
            }
        });


        long totalImportance = 0;
        for (int i = 0; i < n; i++) {
            totalImportance += (long) (n - i) * degree[cities[i]];
        }

        return totalImportance;
    }
}
