class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] product= new int[nums.length];
      int i=0;
      int j=0;
      int prod=1;
      while(i<nums.length && j<nums.length){
         if(i != j){
             prod=prod*nums[j];
         }
         j++;
         if(j == nums.length){
             product[i]=prod;
             prod=1;
             i=i+1;
             j=0;
         }
      }
      return product;
    }
}  
