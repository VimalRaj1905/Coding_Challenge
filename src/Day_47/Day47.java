package Day_47;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day47 {
    public static void main(String[] args) {
        Day47 day47= new Day47();
        int[] nums = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(day47.frequencySort(nums)));
    }
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Integer[] newNums = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            newNums[i] = nums[i];
        }
        Arrays.sort(newNums, (n1, n2) -> {
            if (freq.get(n1) != freq.get(n2)) {
                return freq.get(n1) - freq.get(n2);
            } else {
                return n2 - n1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }
        return nums;
    }
}