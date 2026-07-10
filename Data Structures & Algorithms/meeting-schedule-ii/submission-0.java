/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
       int[] start=new int[intervals.size()];
       int[] end=new int[intervals.size()];
        for(int i=0;i<intervals.size();i++){
            start[i]=intervals.get(i).start;
        }
        for(int i=0;i<intervals.size();i++){
            end[i]=intervals.get(i).end;
        }
       Arrays.sort(start);
       Arrays.sort(end);
       int i=0;
       int j=0;
       int count=0;
       int res=0;
       while(i < start.length){
           if(start[i] < end[j]){
              count++;
              i++;
           }
           else if(start[i] >= end[j]){
               count--;
               j++;
           }
           res=Math.max(res,count);
       }
       return res;
    }
}
