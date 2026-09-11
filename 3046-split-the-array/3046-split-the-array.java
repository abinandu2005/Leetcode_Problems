class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        boolean len;
        if(nums.length%2!=0)return false;
        for(int i:nums)map.put(i,map.getOrDefault(i,0)+1);
        for(int i:map.keySet())if(map.get(i)>2)return false;
        

        return true;
    }
}