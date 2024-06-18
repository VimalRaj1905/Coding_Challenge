package Day_16;

public class Day16 {
    public static void main(String[] args) {
        int [] a = {2,4,6,8,10};
        int [] b = {10,20,30,40,50};
        int [] c = {4,5,6,7};
        System.out.println(new Day16().maxProfitAssignment(a,b,c));

    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxprofit = 0;
        for(int i =0; i<worker.length; i++){
            int max = 0;
            for(int j = 0; j < difficulty.length; j++){
                if(difficulty[j] <= worker[i]){
                    max = Math.max(max,profit[j]);


                }
            }
            maxprofit = maxprofit+max;
        }
        return maxprofit;
    }
}
