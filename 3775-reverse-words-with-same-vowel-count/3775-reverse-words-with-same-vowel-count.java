class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        int len = ss.length, firstCount = getValidCount(ss[0]);
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < len; ++i) {
            if (i != 0 && getValidCount(ss[i]) == firstCount)
                ans.append(new StringBuilder(ss[i]).reverse());
            else
                ans.append(ss[i]);

            if (i != len - 1) ans.append(" ");
        }
        return ans.toString();
    }

    private boolean isValid(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private int getValidCount(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); ++i)
            if (isValid(s.charAt(i))) ++cnt;
        return cnt;
    }
}