class Solution {
    public static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        int n = s.length();
        int old = 1;
        String max = s.substring(0, 1);
        for (int i = 0; i < n; i++) {
            for (int j = i + old; j <= n; j++) {
                if (isPalindrome(s.substring(i, j)) && j - i > old) {
                    old = j - i;
                    max = s.substring(i, j);
                }
            }
        }
        return max;
    }
}

