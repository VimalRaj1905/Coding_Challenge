package Day_31;
import java.util.Arrays;

public class Day31 {
    public static void main(String[] args) {
        int [] arr = {5,3,2,4};
        System.out.println(new Day31().minDifference(arr));;
    }
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        if (n < 4) {
            return 0;
        }
        res = Math.min(res, nums[n - 4] - nums[0]);
        res = Math.min(res, nums[n - 3] - nums[1]);
        res = Math.min(res, nums[n - 2] - nums[2]);
        res = Math.min(res, nums[n - 1] - nums[3]);
        return res;

    }
}
