class Solution {
    public boolean isPalindrome(String s) {
        // two pointys
        int l = 0;
        int r = s.length() - 1;

        // to pass leetcode, must use isLetterOrDigit
        // as numbers are allowed to be in palindrome

        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l += 1;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r -= 1;
                continue;
            }

            if (Character.toLowerCase(s.charAt(l)) 
            != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        
        }        

        return true;
    }
}
