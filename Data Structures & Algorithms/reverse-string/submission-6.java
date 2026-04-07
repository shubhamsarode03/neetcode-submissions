class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n - 1; i++) {
            char lastElement = s[n - 1];
            for (int j = n - 1; j > i; j--) {
                s[j] = s[j - 1];
            }
            s[i] = lastElement;
        }
    }
}