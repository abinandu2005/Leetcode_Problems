class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String []height=new String[names.length];
        class Height{
            String names;
            int heights;
            Height(String names,int heights){
                this.names=names;
                this.heights=heights;
            }
        }
        Height[]sort=new Height[names.length];
        for(int i=0;i<names.length;i++){
            sort[i]=new Height(names[i],heights[i]);
        }
        Arrays.sort(sort,(a,b)->Integer.compare(b.heights,a.heights));
        for(int i=0;i<names.length;i++){
            height[i]=sort[i].names;
        }
        return height;
    }
}