class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(hmap.containsKey(nums[i])){
               return true;
           }
           else{
               hmap.put(nums[i],0);
           }
        }
        return false;
    }
}    