package solutions;

/**
 * @Author weike
 * @Date 2022/4/30 22:54
 * @ClassName ValidAnagram_242
 * @Link https://leetcode.com/problems/valid-anagram/
 * @Analysis
 */
public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}