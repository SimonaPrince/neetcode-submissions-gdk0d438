class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int arr[] = new int[2];
        int left=0;
        int right=left+1;
        while(left < right && right < numbers.length){
           if(numbers[left] + numbers[right] == target){
               arr[0]=left+1;
               arr[1]=right+1;
               break;
           }
           else{
               right++;
               if(right == numbers.length){
                   left++;
                   right=left+1;
               }
           }
        }
        return arr;
    }
}
