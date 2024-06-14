package Day_12;
import java.util.Arrays;

public class Day12 {
    public static void main(String[] args) {
        int [] arr = new int []{1,2,2};
        System.out.println(new Day12().minIncrementForUnique(arr));

    }
    public int minIncrementForUnique(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                res = res + (nums[i-1] - nums[i]) +1;
                nums[i] = nums[i-1] + 1;
            }
        }
        return res;

    }
}
