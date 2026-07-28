class Solution {
    public int scoreOfString(String s) {
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=(int)s.charAt(i);
        }
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            score+=Math.abs(a[i]-a[i+1]);
        }
        return score;

    }
}