class Solution {
    public String reverseWords(String s) {
        String a[]=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]);
            sb.append(" ");
        }
        while(sb.charAt(sb.length()-1)==' ')sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}