package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author weike
 * @Date 2022/4/27 22:48
 * @ClassName FindAllAnagramsString_438
 * @Link
 * @Analysis
 */
public class FindAllAnagramsString_438 {

    public List<Integer> findAnagrams(String s, String p) {
        if (s == null || p == null || s.length() < p.length()) {
            return Collections.emptyList();
        }
        //[i,j]
        int i = 0, j = -1;
        int[] freqP = new int[26];
        int[] freqTmp = new int[26];
        for (int k = 0; k < p.length(); k++) {
            freqP[p.charAt(k) - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        while (j + 1 < s.length()) {
            freqTmp[s.charAt(++j) - 'a']++;

            if (j - i + 1 > p.length()) {
                freqTmp[s.charAt(i++) - 'a'] --;
            }

            if (j -i + 1 == p.length() && isSame(freqP, freqTmp)) {
                res.add(i);
                freqTmp[s.charAt(i++) - 'a'] --;
            }
        }
        return res;

    }

    private boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}