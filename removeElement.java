// 27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            // anything that is not val is added to our sublist
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
            // if num == val, we leave k there for a swap
            // and i will continue to increment until
            // match is found to swap with k
        }

        return k;
        }
    
}
