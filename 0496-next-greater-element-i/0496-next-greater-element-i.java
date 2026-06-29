class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int k = nums1[i];
            int index = -1;
            
            // find position of k in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == k) {
                    index = j;
                    break;
                }
            }
            
            // search for next greater element
            result[i] = -1; // default
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > k) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }
}
