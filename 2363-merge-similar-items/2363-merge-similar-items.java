class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(items1, (a, b) -> a[0] - b[0]);
        Arrays.sort(items2, (a, b) -> a[0] - b[0]);
        int i = 0, j = 0;
        while (i < items1.length && j < items2.length) {
            if (items1[i][0] == items2[j][0]) {
                result.add(Arrays.asList(items1[i][0], items1[i][1] + items2[j][1]));
                i++; j++;
            } else if (items1[i][0] < items2[j][0]) {
                result.add(Arrays.asList(items1[i][0], items1[i][1]));
                i++;
            } else {
                result.add(Arrays.asList(items2[j][0], items2[j][1]));
                j++;
            }
        }
        while (i < items1.length) {
            result.add(Arrays.asList(items1[i][0], items1[i][1]));
            i++;
        }
        while (j < items2.length) {
            result.add(Arrays.asList(items2[j][0], items2[j][1]));
            j++;
        }
        return result;
    }
}