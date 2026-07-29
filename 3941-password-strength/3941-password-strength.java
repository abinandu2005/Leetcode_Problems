class Solution {
    public int passwordStrength(String password) {
        int strength=0;
        Set <Character> set=new HashSet<>();
        for(int i=0;i<password.length();i++){
            if(!set.contains(password.charAt(i))){
                set.add(password.charAt(i));
                if((password.charAt(i)>='a') && (password.charAt(i)<='z'))strength++;
                else if((password.charAt(i)>='A') && (password.charAt(i)<='Z'))strength+=2;
                else if((password.charAt(i)>='0') && (password.charAt(i)<='9'))strength+=3;
                else strength+=5;
            }
        }
        return strength;
    }
}