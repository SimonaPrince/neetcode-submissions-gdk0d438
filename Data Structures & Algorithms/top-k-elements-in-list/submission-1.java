class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i],1);
            }
            else{
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
        }
        // Step 2: Create buckets
        List<List<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // Step 3: Place numbers in their frequency bucket
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            buckets.get(frequency).add(number);
        }

        // Step 4: Collect top k elements
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.size() - 1; i >= 0 && index < k; i--) {

            for (int num : buckets.get(i)) {

                result[index++] = num;

                if (index == k)
                    break;
            }
        }

        return result;
    }

}
