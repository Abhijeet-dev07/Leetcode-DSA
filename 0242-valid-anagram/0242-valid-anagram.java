class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray1[i])     {
                return false;
            }
        }

        return true;
    }
}