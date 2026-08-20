class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[]=new int[arr.length];
        int curMax=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                curMax=Math.max(curMax,arr[j]);
            }
            ans[i]=curMax;
            curMax=0;
        }
        ans[arr.length-1]=-1;
        return ans;
    }
}