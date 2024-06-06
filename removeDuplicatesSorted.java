class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (nums[right] != nums[right - 1]) { // current num is a new num
                left++; // left is the current END of our unique list, so add a spot for a new unique
                nums[left] = nums[right]; // now add the new found unique
                
            }
            right++; // continue through the array
        }

        return ++left; // left is also out unique counter, but remember its always behind by 1
    }
}
