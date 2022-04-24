package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author weike
 * @Date 2022/4/24 23:21
 * @ClassName ValidPalindrome_125
 * @Link https://leetcode.com/problems/valid-palindrome/
 * @Analysis
 */
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        s.substring(1);
        if (s == null){
            throw new IllegalArgumentException("null input");
        }
        if (s.isBlank()) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            while (i < s.length() && !isAlph(s.charAt(i))) {
                i++;
            }
            while (j >= 0 && !isAlph(s.charAt(j))) {
                j--;
            }
            if (i > j) {
                return true;
            }
            if (s.charAt(i) == s.charAt(j)) {
                i ++;
                j --;
            } else {
                return false;
            }
        }
        return true;
    }
    private boolean isAlph(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}