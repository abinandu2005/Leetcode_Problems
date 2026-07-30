class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder mag=new StringBuilder(magazine);

        for(int i=0;i<ransomNote.length();i++){
            int k=mag.indexOf(String.valueOf(ransomNote.charAt(i)));
            if(k!=-1){
                mag.deleteCharAt(k);
            }
            else return false;
        }
        return true;

    }
}