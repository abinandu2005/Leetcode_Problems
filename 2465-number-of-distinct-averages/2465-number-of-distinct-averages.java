class Solution {
    public int distinctAverages(int[] nums) {
        List <Integer> li=new ArrayList<Integer>();
        List <Double> distinct=new ArrayList<Double>();
        for(int i:nums){
            li.add(i);
        }
        int cnt=0;
        double avg=0;
        while(!li.isEmpty()){
            int min=Collections.min(li);
            int max=Collections.max(li);

            avg=(min+max)/2.0;
            if(!distinct.contains(avg)){
                distinct.add(avg);
                cnt++;
            }

            li.remove(Integer.valueOf(min));
            li.remove(Integer.valueOf(max));
        }
        return cnt;
    }
}