class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arrset = new HashSet<>();
        if (nums.length == 0) {
            return 0;
        }
        for (int i : nums) {
            arrset.add(i);
        }
        int max = 0;
        for (int i : arrset) {
               int seq = 0;
            if (!arrset.contains(i - 1)) {
                int x = i;
                while (arrset.contains(x)) {
                    x = x + 1;
                    seq = seq + 1;
                }
                max = Math.max(seq, max);
            }
        }
        return max;
    }
}
