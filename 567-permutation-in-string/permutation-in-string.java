class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        // Frequency of characters in s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        // First window of s2
        for (int i = 0; i < s1.length(); i++) {
            count[s2.charAt(i) - 'a']--;
        }

        // Check first window
        if (isZero(count)) {
            return true;
        }

        // Sliding window
        int left = 0;

        for (int right = s1.length(); right < s2.length(); right++) {

            // Add new character
            count[s2.charAt(right) - 'a']--;

            // Remove old character
            count[s2.charAt(left) - 'a']++;

            left++;

            if (isZero(count)) {
                return true;
            }
        }

        return false;
    }

    private boolean isZero(int[] count) {
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}