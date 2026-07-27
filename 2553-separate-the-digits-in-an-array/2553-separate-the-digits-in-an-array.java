class Solution {
    public int[] separateDigits(int[] nums) {
        List <Integer> list=new ArrayList<>(); 
        for(int i=nums.length-1;i>=0;i--){
            while(nums[i]>0){
                list.add(nums[i]%10);
                nums[i]/=10;
            }
        }
        int a[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            a[list.size()-(i+1)]=list.get(i);
        }
        return a;
    }
}