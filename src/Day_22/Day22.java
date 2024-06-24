package Day_22;

public class Day22 {
    public static void main(String[] args) {
        int[] arr ={0,1,0};
        int a = 1;
        System.out.println(new Day22().minKBitFlips(arr,a));;

    }
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length, flip = 0, res = 0;
        int[] isFlipped = new int[n];
        for (int i = 0; i < nums.length; ++i) {
            if (i >= k)
                flip ^= isFlipped[i - k];
            if (flip == nums[i]) {
                if (i + k > nums.length)
                    return -1;
                isFlipped[i] = 1;
                flip ^= 1;
                res++;
            }
        }
        return res;

    }

}
