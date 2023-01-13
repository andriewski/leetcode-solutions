package by.mark.leetcode;

/**
 * <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int current = nums[i];
                int next = nums[j];

                if (current + next == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
