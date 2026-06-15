class Solution {
    Set<List<Integer>> unique= new HashSet<>();  

    public void findSum(int[] arr, List<Integer> set, List<List<Integer>> subset, int i , int target){
        if(i == arr.length || target < 0){
            return;
        }
        if(target == 0){
            if(!unique.contains(set)){
            subset.add(new ArrayList<>(set));
            unique.add(set);
            }
            return;
        }
        set.add(arr[i]);
        findSum(arr,set,subset,i+1,(target - arr[i]));
        findSum(arr,set,subset,i,(target - arr[i]));
        set.remove(set.size() - 1);
        findSum(arr,set,subset,i+1,target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         List<List<Integer>> subset = new ArrayList<>();
         findSum(nums,new ArrayList<>(),subset,0,target);
         return subset;
    }
}
