class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int a=(nums[i]|nums[j])%2;
                if(a==0)return true;
            }
        }
        return false;
    }
}