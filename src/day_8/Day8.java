package day_8;

import java.util.Arrays;

public class Day8 {
    public static void main(String[] args) {
        int [] heights = {1,1,4,2,1,3};
        System.out.println(new Day8().heightChecker(heights));;

    }
    public int heightChecker(int[] heights) {

        int [] V = Arrays.copyOf(heights,heights.length);
        Arrays.sort(V);
        int result = 0;
        for(int i = 0;i<heights.length;i++){
            if(heights[i] != V[i]){
                result++;
            }
        }
        return result ;
    }

}
