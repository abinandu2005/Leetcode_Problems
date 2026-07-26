class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        Map <Integer,Character> map=new TreeMap<>();
        for(int i=0;i<indices.length;i++){
            map.put(indices[i],s.charAt(i));
        }
        for(int i=0;i<indices.length;i++){
            sb.append(map.get(i));
        }
        return sb.toString();

    }
}