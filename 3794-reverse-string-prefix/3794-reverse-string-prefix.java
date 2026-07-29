class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int l=k;
        while(k!=0){
            sb.append(s.charAt(k-1));
            k--;
        }
        for(int i=l;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}