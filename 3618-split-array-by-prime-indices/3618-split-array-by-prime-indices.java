class Solution {
    public long splitArray(int[] nums) {
        long a=0;
        long b=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(i)){
                a+=nums[i];
            }
            else b+=nums[i];
        }
        return Math.abs(a-b);
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;  
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;     
            }
        }
        return true;  
    }
}