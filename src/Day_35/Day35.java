package Day_35;

import java.util.ArrayList;

public class Day35 {
    public static void main(String[] args) {
        int n = 5 ;
        int k = 2 ;
        System.out.println(new Day35().findTheWinner(n,k));

    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            circle.add(i);
        }
        int cur = 0;

        while (circle.size() > 1) {
            int next = (cur + k - 1) % circle.size();
            circle.remove(next);
            cur = next;
        }

        return circle.get(0);
    }
}
