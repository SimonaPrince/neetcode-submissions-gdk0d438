class Solution {

    public void collectSubset(int[] arr, List<Integer> set, List<List<Integer>> subset, int i){
        if(i == arr.length){
            subset.add(new ArrayList<>(set));
            return;
        }
        set.add(arr[i]);
        collectSubset(arr,set,subset,i+1);
        set.remove(set.size()-1);
        collectSubset(arr,set,subset,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset  = new ArrayList();
        collectSubset(nums,new ArrayList<>(),subset,0);
        return subset;
    }
}
