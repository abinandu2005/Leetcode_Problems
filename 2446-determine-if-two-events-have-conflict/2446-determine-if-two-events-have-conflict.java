class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {

        int sthr1  = Integer.parseInt(event1[0].substring(0, 2));
        int stmin1 = Integer.parseInt(event1[0].substring(3, 5));

        int enhr1  = Integer.parseInt(event1[1].substring(0, 2));
        int enmin1 = Integer.parseInt(event1[1].substring(3, 5));

        int sthr2  = Integer.parseInt(event2[0].substring(0, 2));
        int stmin2 = Integer.parseInt(event2[0].substring(3, 5));

        int enhr2  = Integer.parseInt(event2[1].substring(0, 2));
        int enmin2 = Integer.parseInt(event2[1].substring(3, 5));

        int start1 = sthr1 * 60 + stmin1;
        int end1   = enhr1 * 60 + enmin1;

        int start2 = sthr2 * 60 + stmin2;
        int end2   = enhr2 * 60 + enmin2;

        return start1 <= end2 && start2 <= end1;
    }
}