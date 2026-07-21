class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k=0;
        int a[]=new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    a[k]=arr1[j];
                    arr1[j]=-1;
                    k++;
                }
            }
        }
        Arrays.sort(arr1);
        for(int j=0;j<arr1.length;j++){
            if(arr1[j]!=-1){
                a[k]=arr1[j];
                k++;
            }
        }
        return a;
    }
}