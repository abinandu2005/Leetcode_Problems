class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i=num.length-1;
        List<Integer> ans=new ArrayList<>();
        while(i>=0 || k>0){
            if(i>=0){
                k+=num[i];
                i--;
            }
            ans.add(k%10);
            k/=10;
        }
        Collections.reverse(ans);
        return ans;
    }
}