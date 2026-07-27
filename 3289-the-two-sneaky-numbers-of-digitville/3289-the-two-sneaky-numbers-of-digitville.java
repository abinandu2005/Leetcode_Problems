class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set <Integer> set=new HashSet<>();
        int []arr=new int[2];
        int q=0;
        for(int i:nums){
            if(set.contains(i)){
                arr[q]=i;
                q++;
            }
            else set.add(i);
        }
        return arr;
    }
}