class Solution {
    public boolean checkZeroOnes(String s) {
        int max0 = 0, max1 = 0;
        int cnt0 = 0, cnt1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt1++;
                cnt0 = 0;
                max1 = Math.max(max1, cnt1);
            } else {
                cnt0++;
                cnt1 = 0;
                max0 = Math.max(max0, cnt0);
            }
        }

        return max1 > max0;
    }
}