class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            cur+=i;
            if(max<cur)max=cur;
            if(cur<0)cur=0;
        }
        return max;
    }
}