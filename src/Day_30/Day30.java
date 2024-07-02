package Day_30;

import java.util.HashSet;
import java.util.Set;

public class Day30 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {2,3};
        System.out.println(new Day30().intersect(arr,arr2));

    }
    public Set<Integer> intersect(int[] nums1, int[] nums2) {


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();


        for (int num : nums1) {
            set1.add(num);
        }


        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;


    }
    }

