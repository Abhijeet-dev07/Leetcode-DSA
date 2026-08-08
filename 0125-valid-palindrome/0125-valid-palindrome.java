class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // Ignore spaces and special characters from left
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }

            // Ignore spaces and special characters from right
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            // Compare characters ignoring upper/lower case
            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            // Move both pointers
            i++;
            j--;
        }

        return true;
    }
}