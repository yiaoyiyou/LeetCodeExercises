package solutions;

/**
 * @Author weike
 * @Date 2022/5/15 12:03
 * @ClassName Jz49
 * @Link https://www.nowcoder.com/practice/6aa9e04fc3794f68acf8778237ba065b?tpId=265&rp=1&ru=%2Fexam%2Foj%2Fta&qru=%2Fexam%2Foj%2Fta&sourceUrl=%2Fexam%2Foj%2Fta%3FtpId%3D13&difficulty=&judgeStatus=&tags=&title=&gioEnter=menu
 * @Analysis 丑数
 */
public class Jz49 {

    public int GetUglyNumber_Solution(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("invalid index");
        }
        if (index == 0) {
            return 1;
        }
        int[] record = new int[index];
        record[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        for (int i = 1; i < index; i ++) {
            int cur = Math.min(Math.min(record[index2] * 2, record[index3] * 3), record[index5] * 5);
            if (cur == record[index2] * 2) {
                index2++;
            }
            if (cur == record[index3] * 3) {
                index3++;
            }
            if (cur == record[index5] * 5) {
                index5++;
            }
            record[i] = cur;
        }
        return record[index - 1];
    }
}