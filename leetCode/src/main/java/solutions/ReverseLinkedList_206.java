package solutions;

/**
 * @Author weike
 * @Date 2022/5/7 22:36
 * @ClassName ReverseLinkedList_206
 * @Link
 * @Analysis
 */
public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
        //注意，初识状态cur 并没指向pre
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            //防止丢失
            ListNode next = cur.next;
            //交换位置
            cur.next = pre;
            //更新变量
            pre = cur;
            cur = next;
        }
        return pre;
    }
}