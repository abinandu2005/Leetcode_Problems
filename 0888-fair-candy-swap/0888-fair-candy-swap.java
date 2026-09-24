class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int at=0,bt=0;
       for(int i:aliceSizes)at+=i;
       for(int i:bobSizes)bt+=i;
       int diff = (at - bt) / 2;

        for (int x : aliceSizes) {
            for (int y : bobSizes) {

                if (x - y == diff) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{};
    }
}