class Solution {
    public void duplicateZeros(int[] arr) {
        List <Integer>li=new ArrayList<>();
        for(int i:arr){
            li.add(i);
            if(li.get(li.size()-1)==0)li.add(0);
            if(li.size()>=arr.length)break;
            
        }
        System.out.print(li);
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }

    }
}