public class HouseRobberII {

    int rob(int[] nums) {

        int n=nums.length;
        // Handle edge cases
        if (n == 1) {
            return nums[0];
        }

        // Create 2 new arrays
        int[] skipLastHouse = new int[n - 1];
        int[] skipFirstHouse = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i + 1];
        }

        // Get the loot from both the possibilities
        int lootSkippingLast = robHelper(skipLastHouse);
        int lootSkippingFirst = robHelper(skipFirstHouse);

        // Return the maximum of 2 loots
        return Math.max(lootSkippingLast, lootSkippingFirst);
    }

    private int robHelper(int[] nums) {

        int n=nums.length;
        // Handle edge cases
        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[n - 1];
    }
}

class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // No houses to rob
        }

        if (nums.length == 1) {
            return nums[0]; // Only one house to rob
        }

        HouseRobberII houseRobber = new HouseRobberII();
        return houseRobber.rob(nums);
    }
}
