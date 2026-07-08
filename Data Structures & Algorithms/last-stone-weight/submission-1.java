class Solution {
    public int lastStoneWeight(int[] stones) {
      int num=0;
        PriorityQueue<Integer> pr= new PriorityQueue<>(Comparator.reverseOrder());
        for(int val: stones) {
            pr.add(val);
        }
        while(pr.size()>1){
           int x=pr.poll();
           int y=pr.poll();
           if(x != y){
               pr.add(x-y);
           }
       }
       if(!pr.isEmpty())
          num=pr.poll();
       return num;
    }
}
