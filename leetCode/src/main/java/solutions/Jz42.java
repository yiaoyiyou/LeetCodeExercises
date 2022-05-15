package solutions;

/**
 * @Author weike
 * @Date 2022/5/15 11:21
 * @ClassName Jz42
 * @Link https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484?tpId=265&tqId=39244&rp=1&ru=/exam/oj/ta&qru=/exam/oj/ta&sourceUrl=%2Fexam%2Foj%2Fta%3FtpId%3D13&difficulty=undefined&judgeStatus=undefined&tags=&title=
 * @Analysis
 */
public class Jz42 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("invalid array");
        }
        //防止越界
        int cur = 0;
        int max = Integer.MIN_VALUE;
        //自底向上dp
        for (int i = 0; i < array.length; i++) {
            cur += array[i];
            max = Math.max(cur, max);
            if (cur < 0) {
                cur = 0;
            }
        }
        return max;
    }
}