class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set <Integer> set=new HashSet<>();
        List <Integer> li=new ArrayList<>();
        for(int i:nums){
            if(set.contains(i)){
                li.add(i);
            }
            else set.add(i);
        }
        int []arr=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}