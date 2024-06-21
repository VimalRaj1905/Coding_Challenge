package Day_19;

public class Day19 {
    public static void main(String[] args) {
        //customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3

        int[] arr = {1,0,1,2,1,1,7,5};
        int[] arr1 = {0,1,0,1,0,1,0,1};
        int a = 3;
        System.out.println(new Day19().maxSatisfied(arr,arr1,a));

    }
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int sum = 0;
        for( int i = 0; i < n; i++){
            if(grumpy[i] == 0) sum = sum + customers[i];


        }
        int loss = 0;
        for(int i = 0; i < minutes; i++){
            if(grumpy[i] == 1) loss = loss + customers[i];

        }
        int maxLoss = loss;
        int i = 0;
        int j = minutes;
        while( j < n){
            if(grumpy[i] == 1) loss = loss - customers[i];
            if(grumpy[j] == 1) loss = loss + customers[j];
            maxLoss = Math.max(maxLoss,loss);
            i++;
            j++;
        }
        return sum + maxLoss;

    }
}
