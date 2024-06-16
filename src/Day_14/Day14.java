package Day_14;

public class Day14 {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int n = 6;
        System.out.println(new Day14().minPatches(arr,n));

    }
    public int minPatches(int[] nums, int n) {
        long patch = 0;
        int count = 0;
        int index = 0;
        while (patch < n) {
            if (index < nums.length && patch + 1 >= nums[index]) {
                patch += nums[index];
                index++;
            } else {
                patch += (patch + 1);
                count++;
            }
        }

        return count;
    }
}
