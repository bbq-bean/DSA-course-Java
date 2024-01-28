class Solution {
    public int removeDuplicates(int[] nums) {
        // 2 pointers
        // starting at k, check k + 1

        // if k - 1 != k, that means, k a new unique

        // bump n++ and swap k with n
        // so swap k with n
        // 111222333

        int k = 1;
        int n = 0;

        while (k < nums.length) {
            if (nums[k] != nums[k - 1]) {
                n++;
                nums[n] = nums[k];
                
            }
            k++;
        }

        return n + 1;
    }
