class Solution {
    public int[] concatWithReverse(int[] nums) {
        int a[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
            a[nums.length+i]=nums[nums.length-(i+1)];
        }
        return a;
    }
}