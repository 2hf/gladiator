package leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        return new int[]{a, b};
    }

    public static int[] twoSumWithHashTable(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                a = map.get(complement);
                b = i;
                break;
            }
            map.put(nums[i], i);
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumWithHashTable(nums, target);
        System.out.printf("[%d, %d]", result[0], result[1]);
    }
}
