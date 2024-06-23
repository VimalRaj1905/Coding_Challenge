package Day_21;


import java.util.LinkedList;

import static java.lang.System.out;

public class Day21 {
    public static void main(String[] args) {
        int [] arr = {8,2,4,7};
        int a = 4;
        System.out.println(new Day21().longestSubarray(arr,a));
    }
    public int longestSubarray(int[] nums, int limit) {

        LinkedList<Integer> increase = new LinkedList<>();
        LinkedList<Integer> decrease = new LinkedList<>();

        int max = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            while (increase.size() > 0 && n < increase.getLast()) {
                increase.removeLast();
            }
            increase.add(n);

            while (decrease.size() > 0 && n > decrease.getLast()) {
                decrease.removeLast();
            }

            decrease.add(n);

            while (decrease.getFirst() - increase.getFirst() > limit) {
                if (nums[left] == decrease.getFirst()) {
                    decrease.removeFirst();
                }
                if (nums[left] == increase.getFirst()) {
                    increase.removeFirst();
                }
                left++;
            }

            int size = i - left + 1;
            max = Math.max(max, size);
        }

        return max;
    }
}
