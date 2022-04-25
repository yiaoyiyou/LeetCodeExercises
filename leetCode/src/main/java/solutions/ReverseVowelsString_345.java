package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author weike
 * @Date 2022/4/25 0:30
 * @ClassName ReverseVowelsString_345
 * @Link https://leetcode.com/problems/reverse-vowels-of-a-string/
 * @Analysis
 */
public class ReverseVowelsString_345 {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int i = 0, j = s.length() - 1;
        while(i < j) {
            while(i < s.length() && !vowels.contains(s.charAt(i))) {
                i ++;
            }
            while(j >= 0 && !vowels.contains(s.charAt(j))) {
                j --;
            }
            if (i >= j) {
                return s;
            }
            char swap = s.charAt(i);
            s = s.substring(0, i) + s.charAt(j) + s.substring(i + 1);
            s = s.substring(0, j) + swap + s.substring(j + 1);
            i++;
            j--;
        }
        return s;

    }

    public String reverseVowelsV1(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while(i < j) {
            while(i < chars.length && !vowels.contains(chars[i])) {
                i ++;
            }
            while(j >= 0 && !vowels.contains(chars[j])) {
                j --;
            }
            if (i >= j) {
                return new String(chars);
            }
            char swap = chars[i];
            chars[i] = chars[j];
            chars[j] = swap;

            i++;
            j--;
        }
        return new String(chars);

    }
}