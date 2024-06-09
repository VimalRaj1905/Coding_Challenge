package Day_7;

public class Day7 {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(new Day7().subarraysDivByK(arr,k));;

    }
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;

        int A = 0, result = 0;
        int B [] = new int[k];
        B [0] = 1;
        for(int num: nums){
            A = (A + num % k + k) % k;
            result = result + B[A];
            B[A]++;
        }
        return result;
    }
}
