class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven=0,sumOdd=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                sumEven+=i;
            }
            else sumOdd+=i;
        }
        while(sumEven!=0){
            int temp=sumEven;
            sumEven=sumOdd%sumEven;
            sumOdd=temp;
        }
        return sumOdd;
    }
}