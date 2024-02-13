class Solution {
    public int longestConsecutive(int[] nums) {

        // corner cases
        if (nums.length == 0) return 0;

        Set<Integer> seent = new HashSet<>();
        
        for (int num : nums) {
            seent.add(num);
        }

        // this will always increment to >= 1
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            
            // then we are at the start of a new sequence
            if (!seent.contains(nums[i] - 1)) {
                int curr = 1;
                // the next number is always from original start + curr
                while (seent.contains(nums[i] + curr)) {
                    curr += 1;

                }

                if (curr > ans) ans = curr;
            }
        }
    
        return ans;
    }
}

