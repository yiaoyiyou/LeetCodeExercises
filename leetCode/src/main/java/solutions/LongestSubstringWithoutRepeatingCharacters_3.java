package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author weike
 * @Date 2022/4/27 9:21
 * @ClassName LongestSubstringWithoutRepeatingCharacters_3
 * @Link
 * @Analysis
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        //[i, j]
        int i = 0, j = -1;
        int sumLength = -1;
        Set<Character> charSet = new HashSet<>();
        while (i <s.length()) {
            if (j + 1 < s.length() && !charSet.contains(s.charAt(j + 1))) {
                charSet.add(s.charAt(++j));
            } else {
                charSet.remove(s.charAt(i++));
            }
            sumLength = Math.max(sumLength, j - i + 1);

        }
        return sumLength;
    }
    public int lengthOfLongestSubstringV1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        //[i, j]
        int i = 0, j = -1;
        int sumLength = -1;
        int[] freq = new int[256];
        while (i <s.length()) {
            if (j + 1 < s.length() && freq[s.charAt(j + 1)] == 0) {
                freq[s.charAt(++j)] ++;
            } else {
                freq[s.charAt(i++)] --;
            }
            sumLength = Math.max(sumLength, j - i + 1);

        }
        return sumLength == -1 ? 0 :sumLength;

    }
}