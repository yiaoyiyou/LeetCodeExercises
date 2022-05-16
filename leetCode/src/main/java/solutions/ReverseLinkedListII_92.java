package solutions;

/**
 * @Author weike
 * @Date 2022/5/17 0:41
 * @ClassName ReverseLinkedListII_92
 * @Link https://leetcode.com/problems/reverse-linked-list-ii/
 * @Analysis
 */
public class ReverseLinkedListII_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        //穿针引线的秘诀是，不要走丢
        //尽量表达清晰，不要引入没有必要的变量
        //注意索引的开始位置
        ListNode dummayNode = new ListNode(-1);
        dummayNode.next = head;
        ListNode pre = dummayNode;
        //这里是前进n-1次，因为n是从1开始索引
        for (int i = 0; i < left - 1; i ++) {
            pre = pre.next;
        }
        ListNode start = pre.next;
        ListNode then = start.next;

        for (int i = 0; i < right - left; i ++) {
            //切断s->t
            start.next = then.next;
            //切断pre
            then.next = pre.next;
            pre.next = then;
            //更新then
            then = start.next;
        }
        return dummayNode.next;
    }
}