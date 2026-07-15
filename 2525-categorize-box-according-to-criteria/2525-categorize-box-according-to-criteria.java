class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long dimensions=1l*length*width*height;
        boolean bulky=false;
        boolean heavy=false;
        if(dimensions>=1000000000 || length>=10000 || height>=10000 || width>=10000)bulky =true;
        if(mass>=100) heavy=true;
        if(bulky && heavy)return "Both";
        if(bulky && !heavy)return "Bulky";
        if(!bulky && heavy)return "Heavy";
        return "Neither";
    }
}