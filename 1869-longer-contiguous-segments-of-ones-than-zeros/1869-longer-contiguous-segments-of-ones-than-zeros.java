class Solution {
    public boolean checkZeroOnes(String s) {
        int nums[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            nums[i]=s.charAt(i)-'0';
        } 
        int cnt1=0;
        int cnt0=0;
        int max0=0,max1=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==1){
                cnt1++;
            }
            else cnt1=0;
            if(cnt1>max1)max1=cnt1;
            if(nums[i]==0){
                cnt0++;
            }
            else cnt0=0;
            if(cnt0>max0)max0=cnt0;
        }
        
        if(max0>=max1)return false;
        return true;
    }
}