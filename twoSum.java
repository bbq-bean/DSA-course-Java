class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create hashmap with keys a nums seent and value as their index where seen
        HashMap<Integer, Integer> seent = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // what are we looking for?
            int diff = target - nums[i];
            
            if (seent.containsKey(diff)) {
                int[] ans = {i, seent.get(diff)};
                
                return ans;
                // return new int[] {i, seent.get(diff)};
            }
            
            seent.put(nums[i], i);
            
        }
        int[] dummy = {}; 
        return dummy;
        // return new int[] {};
    }
}