class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap <Integer,String>map=new HashMap<>();
        int a[]=new int[score.length];
        String arr[]=new String[score.length];
        for(int i=0;i<score.length;i++){
            a[i]=score[i];
        }
        Arrays.sort(a);
        int n = a.length;

        if (n >= 1)
            map.put(a[n - 1], "Gold Medal");

        if (n >= 2)
            map.put(a[n - 2], "Silver Medal");

        if (n >= 3)
            map.put(a[n - 3], "Bronze Medal");

        int rank = 4;
        for (int i = n - 4; i >= 0; i--) {
            map.put(a[i], String.valueOf(rank++));
        }
        for(int i=0;i<score.length;i++){
            arr[i]=map.get(score[i]);
        }
        

        return arr;
    }
}