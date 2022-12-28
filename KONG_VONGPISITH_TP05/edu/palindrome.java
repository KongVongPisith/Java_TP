package edu;

public class palindrome {
    private String str;

    public palindrome(String str) {
        this.str = str;
    }

    public boolean isRev() {
        int n = str.length();
        String str1 = "";
        for (int i = 0; i < n; i++) {
            str1 = str.charAt(i) + str1;
        }
        return str.equals(str1);
    }

    public boolean isLoop() {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
