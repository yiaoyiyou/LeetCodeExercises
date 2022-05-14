package solutions;

import java.util.List;

/**
 * @Author weike
 * @Date 2022/5/14 11:20
 * @ClassName LetterCombinationsofaPhoneNumber_17
 * @Link
 * @Analysis
 */
public class LetterCombinationsofaPhoneNumber_17 {
    // O(3^n) 即O(2^)
    String[] letters = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> res;

    // 原始数组digits， 处理的位置index，当前组装好的字符串
    private void findCombinateions(String digits, int index, String s) {
        //递归终止条件
        if (index >= digits.length()) {
            res.add(s);
            return;
        }
        String letter = letters[digits.charAt(index) - '2'];
        //处理递归过程
        for (int i = 0; i < letter.length(); i ++) {
            //进行回溯
            // s+的过程，就是新字段产出的过程，每次调用，都要回到上一层进行处理
            findCombinateions(digits, index + 1, s + letter.charAt(i));
        }

        return;
    }
}