class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0, maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);
        int n = nums.length;

        int bothLeft = right + 1;

        int bothRight = n - left;

        int oppositeSides = (left + 1) + (n - right);

        return Math.min(bothLeft, Math.min(bothRight, oppositeSides));
    }
}