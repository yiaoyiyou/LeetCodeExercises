package solutions;

/**
 * @Author weike
 * @Date 2022/4/25 0:06
 * @ClassName ReverseString_344
 * @Link https://leetcode.com/problems/reverse-string/
 * @Analysis
 */
public class ReverseString_344 {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int i = 0, j = s.length - 1;
        while (i < j) {
            char swap = s[i];
            s[i] = s[j];
            s[j] = swap;
            i++;
            j--;
        }

    }
}