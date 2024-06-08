package Day_6;
import java.util.HashMap;
import java.util.Map;

public class Day6 {
    public static void main(String[] args) {
        int arr[] = new int []{23,2,4,6,7};
        int k = 6;
        System.out.println(new Day6().checkSubarraySum(arr,k));

    }
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            if (remainderIndexMap.containsKey(remainder)) {
                if (i - remainderIndexMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderIndexMap.put(remainder, i);
            }
        }

        return false;
    }
}
