package Day_13;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Day13 {
    private static int[] capital;

    public static void main(String[] args) {
        int k = 2, w = 0;
        int[] profits = new int[]{1,2,3};
        int capital[] = new int[]{0,1,1};
        System.out.println(new Day13().findMaximizedCapital(k,w,profits,capital));

    }
    private static class Demo{
        int capital;
        int profit;
        Demo(int capital,int profit){
            this.capital = capital;
            this.profit = profit;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<Demo> demo = new ArrayList<>();

        for (int i=0;i<n;i++){
            demo.add(new Demo(capital[i],profits[i]));

        }
        Collections.sort(demo,(a, b) ->a.capital - b.capital);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> y-x);
        int i = 0;
        for(int j = 0;j < k;j++){
            while(i<n && demo.get(i).capital<=w){
                maxHeap.add(demo.get(i).profit);
                i++;
            }
            if(maxHeap.isEmpty()){
                break;
            }
            w = w+maxHeap.poll();
        }
        return w;
    }
}
