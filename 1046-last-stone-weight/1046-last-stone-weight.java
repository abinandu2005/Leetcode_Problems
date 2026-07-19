class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1)return stones[0];
        while(true){
            Arrays.sort(stones);
            int i=stones[stones.length-1];
            int j=stones[stones.length-2];
            if(j==0)return i;
            stones[stones.length-1]=i-j;
            stones[stones.length-2]=0;
        }       
    }
}