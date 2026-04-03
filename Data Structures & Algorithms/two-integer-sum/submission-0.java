class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=i+1;
        while(i <j && j < nums.length){
            if(nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
            else{
                j++;
                if(j == nums.length){
                    i++;
                    j=i+1;
                }
            }
        }
        return new int[]{};
    }
}
