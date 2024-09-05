class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        // 1 2 1 0 0 0
        for (int i = 0; i < nums.length; i++) {
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}

//1929. Concatenation of Array
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
