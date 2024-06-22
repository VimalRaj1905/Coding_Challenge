package Day_20;

public class Day20 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,1,1};
        int k = 3;
        System.out.println(new Day20().numberOfSubarrays(arr,k));

    }
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[n + 1];
        count[0] = 1;
        int result = 0, oddCount = 0;
        for (int num : nums) {
            oddCount += num & 1;
            if (oddCount - k >= 0) {
                result += count[oddCount - k];
            }
            count[oddCount]++;
        }
        return result;

    }
}
