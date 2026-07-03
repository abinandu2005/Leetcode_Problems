class Solution {
    public int digitFrequencyScore(int n) {
        int c=0;
        while(n>0){
            int a=n%10;
            c+=a;
            n/=10;
        }
        return c;
    }
}