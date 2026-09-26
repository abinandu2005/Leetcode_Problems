class Solution {
    public int smallestIndex(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            int nums1=nums[i];
            while(nums1>0){
                num+=nums1%10;
                nums1/=10;
            }
            if(i==num)return i;
            num=0;           
        }
        return -1;
    }
}