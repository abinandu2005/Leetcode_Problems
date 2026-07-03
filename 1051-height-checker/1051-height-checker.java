class Solution {
    public int heightChecker(int[] heights) {
        int a[]=new int[heights.length];
        int cnt=0;
        for(int i=0;i<heights.length;i++){
            a[i]=heights[i];
        }
        Arrays.sort(a);
        for(int i=0;i<heights.length;i++){
            if(a[i]!=heights[i])cnt++;
        }
        return cnt;
    }
}