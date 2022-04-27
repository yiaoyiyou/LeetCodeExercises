package solutions;

/**
 * @Author weike
 * @Date 2022/4/28 0:03
 * @ClassName MinimumWindowSubstring_76
 * @Link
 * @Analysis
 */
public class MinimumWindowSubstring_76 {
    public String minWindow(String s, String t) {
        int i = 0, j = -1;
        int[] freq = new int[256];
        for (int k = 0; k < t.length(); k++) {
            freq[t.charAt(k)]++;
        }
        int[] freqTmp = new int[256];
        String res = s + "0";
        while (j + 1< s.length()) {
            freqTmp[s.charAt(++j)]++;
            //是否满足有效条件
            if (j - i + 1 >= t.length() && isContains(freqTmp, freq)) {
                res = res.length() > (j - i + 1) ? s.substring(i, j+1) : res;
                freqTmp[s.charAt(i++)]--;
            }
            while (i < s.length() && freqTmp[s.charAt(i)] > freq[s.charAt(i)]) {
                freqTmp[s.charAt(i++)]--;
            }

        }
        return res.length() == s.length() + 1 ? "" : res;

    }

    private boolean isContains(int[] a, int[] b) {
        for (int i = 0; i < b.length; i ++) {
            if (a[i] < b[i]) {
                return false;
            }
        }
        return true;
    }
}