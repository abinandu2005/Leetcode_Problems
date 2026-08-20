class Solution {
    public int findSpecialInteger(int[] arr) {
        int per=arr.length/4;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i:arr)map.put(i,map.getOrDefault(i,0)+1);
        for(int i:map.keySet()){
            if(map.get(i)>per)return i;
        }
        return -1;
    }
}