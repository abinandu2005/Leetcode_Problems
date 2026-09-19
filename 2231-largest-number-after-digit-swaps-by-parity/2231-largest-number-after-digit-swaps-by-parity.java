class Solution {
    public int largestInteger(int num) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        String s = String.valueOf(num);

        for (char c : s.toCharArray()) {
            int digit = c - '0';

            if (digit % 2 == 0)
                even.add(digit);
            else
                odd.add(digit);
        }

        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even, Collections.reverseOrder());

        int oi = 0, ei = 0;
        int ans = 0;

        for (char c : s.toCharArray()) {
            int digit = c - '0';

            if (digit % 2 == 0)
                ans = ans * 10 + even.get(ei++);
            else
                ans = ans * 10 + odd.get(oi++);
        }

        return ans;
    }
}