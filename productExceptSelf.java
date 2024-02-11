class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        int right = 1;
        int left = 1;

        // build left
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left; // arr[0] is always 1
            left *= nums[i];
        }    

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }

        return arr;
        
    }
}
