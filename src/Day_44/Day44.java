package Day_44;

import java.util.*;

public class Day44 {
    public static void main(String[] args) {
        int [][] matrix = {{3,7,8},{9,11,13},{15,16,17}};;
System.out.println(new Day44().luckyNumbers(matrix));
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<n;i++){
            int num = Integer.MAX_VALUE;
            int index = -1;
            for(int j = 0;j<m;j++){
                if(matrix[i][j]<num){
                    num = matrix[i][j];
                    index = j;
                }
            }
            boolean flag = true;
            for(int k=0;k<n;k++){
                if(matrix[k][index]>num){
                    flag = false;
                }
            }
            if(flag){
                list.add(num);
            }
        }
        return list;
    }
}
