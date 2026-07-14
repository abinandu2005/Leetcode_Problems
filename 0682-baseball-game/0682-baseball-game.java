class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        List <Integer> a=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                a.remove(a.size()-1);
            }
            else if(operations[i].equals("+")){
                a.add((Integer.valueOf(a.get(a.size()-1)))+(Integer.valueOf(a.get(a.size()-2))));
            }
            else if(operations[i].equals("D")){
                a.add(Integer.valueOf(a.get(a.size()-1))*2);
            }
            else{
                a.add(Integer.valueOf(operations[i]));
            }
        }
        for(int i:a)sum+=i;
        return sum;
    }
}