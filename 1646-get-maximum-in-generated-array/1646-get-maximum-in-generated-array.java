class Solution {
    public int getMaximumGenerated(int n) {
        int max=1;
        int a[]=new int[n+1];
        if(n==0)return 0;
        a[0]=0;
        a[1]=1;
        int j=1,k=1,l=2;
        for(int i=2;i<a.length;i++){
            if(i%2==0){
                a[i]=a[j];
                j++;
            }
            else{
                a[i]=a[k]+a[l];
                k++;
                l++;
            }
            max=Math.max(max,a[i]);
        }
        return max;
    }
}