class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] a=new int[nums.length];
        int k=0,eq=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                a[k]=nums[i];
                k++;
            }
            if(nums[i]==pivot)eq++;
        }
        while(eq>0){
            a[k]=pivot;
            eq--;
            k++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                a[k]=nums[i];
                k++;
            }
        }

        
        
        return a;
    }
}