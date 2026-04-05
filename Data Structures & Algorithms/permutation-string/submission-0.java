public class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];

        // frequency of s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int k = s1.length();

        // check every window
        for (int i = 0; i <= s2.length() - k; i++) {

            int[] windowCount = new int[26];

            // build frequency for current substring
            for (int j = i; j < i + k; j++) {
                windowCount[s2.charAt(j) - 'a']++;
            }

            // compare arrays
            boolean match = true;
            for (int x = 0; x < 26; x++) {
                if (s1Count[x] != windowCount[x]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }
}