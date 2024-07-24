package Day_48;

import java.util.ArrayList;
import java.util.List;

public class Day48  {
    public static void main(String[] args) {
        int[] a = {8,9,4,0,2,1,3,5,7,6};
        int[] b = {991, 338, 38};
        System.out.println(new Day48().sortJumbled(a,b));
    }

public int[] sortJumbled(int[] mapping, int[] nums) {
    List<int[]> mappedList = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        String s = Integer.toString(nums[i]);
        StringBuilder n = new StringBuilder();
        for (char ch : s.toCharArray()) {
            n.append(mapping[ch - '0']);
        }
        mappedList.add(new int[]{nums[i], Integer.parseInt(n.toString()), i});
    }

    mappedList.sort((a, b) -> {
        if (a[1] != b[1]) {
            return Integer.compare(a[1], b[1]);
        } else {
            return Integer.compare(a[2], b[2]);
        }
    });

    int[] sortedNums = new int[nums.length];
    for (int i = 0; i < mappedList.size(); i++) {
        sortedNums[i] = mappedList.get(i)[0];
    }

    return sortedNums;
}
}
