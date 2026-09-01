class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int breakIndex = -1;

        for (int i = 1; i < n; i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                if (breakIndex != -1)
                    return -1;   // more than one break

                breakIndex = i;
            }
        }
        if (breakIndex == -1)
            return 0;
        if (nums.get(n - 1) > nums.get(0))
            return -1;

        return n - breakIndex;
    }
}