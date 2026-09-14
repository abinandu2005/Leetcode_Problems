class Solution {
    public int findMaxK(int[] nums) {
        TreeSet <Integer>set=new TreeSet<>();
        for(int i:nums)set.add(i);
        while(set.size()>0){
            int high=set.last();
            int neg=-high;
            if(set.contains(high)&&set.contains(neg))return high;
            else set.remove(high);
        }
        return -1;
    }
}