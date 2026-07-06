class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
      int right=0;
      for(int i:piles){
          right=Math.max(i,right);
      }
        int min=right;
        while (left <= right) {

            int mid = left + (right - left) / 2;

            long hours = 0;

            // Calculate total hours needed at speed = mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;   // Equivalent to ceil(pile / mid)
            }

            if (hours <= h) {
                min = mid;      // This speed works
                right = mid - 1;   // Try to find a smaller speed
            } else {
                left = mid + 1;    // Need a faster speed
            }
        }
      return min;
    }
}
