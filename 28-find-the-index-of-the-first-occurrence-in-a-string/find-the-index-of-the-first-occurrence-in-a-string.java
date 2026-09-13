class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;

        int k = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(k)) {
                int j = i;
                while (k < needle.length() && j < haystack.length() && haystack.charAt(j) == needle.charAt(k)) {
                    j++;
                    k++;
                }
                if (k == needle.length()) {
                    return i;
                } else {
                    j = 0;
                    k = 0;
                }
            }
        }
        return -1;
    }
}