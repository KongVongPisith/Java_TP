package edu;

public class String_mirroring {
    private String str;

    public String_mirroring(String str) {
        this.str = str;
    }

    public String makePalindrome() {
        int n = str.length();
        String str1 = "";
        for (int i = 0; i < n; i++) {
            str1 = str.charAt(i) + str1;

        }
        return str + str1;
    }
}
