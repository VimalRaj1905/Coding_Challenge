package Day_56;

public class Day56 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,0,1,0};
        int n = nums.length;
        int totalOnes = 0;

        for (int num : nums) {
            totalOnes += num;//4
        }
        int currentOnes = 0;


        for (int i = 0; i < totalOnes; i++) {
            currentOnes += nums[i];
        }

        int maxOnes = currentOnes;

        for (int i = 0; i < n; i++) {
            currentOnes -= nums[i];
            currentOnes += nums[(i + totalOnes) % n];
            maxOnes = Math.max(maxOnes, currentOnes);
        }

        System.out.println(totalOnes-maxOnes);
    }
}
