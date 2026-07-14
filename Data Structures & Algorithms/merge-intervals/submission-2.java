class Solution {
    public int[][] merge(int[][] intervals) {
       List<int[]> res= new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int i=0;
        int start=intervals[i][0];
        int end=intervals[i][1];
        while(i < intervals.length-1){
               if(end >= intervals[i+1][0]) {
                   end = Math.max(end, intervals[i + 1][1]);
               }
               else{
                   res.add(new int[]{start,end});
                   start=intervals[i+1][0];
                   end=intervals[i+1][1];
               }
            i++;
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);
    }
}
