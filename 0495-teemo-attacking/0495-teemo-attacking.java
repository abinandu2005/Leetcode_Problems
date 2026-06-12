class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int cnt=0;
        for(int i=0;i<timeSeries.length-1;i++){
            cnt += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        return duration+cnt;
    }
}