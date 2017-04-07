package leetcode.algorithm;

/**
 * Created by ZH.F on 2017/4/7.
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int left = 0;
        ListNode head = new ListNode(0);
        ListNode cursor = head;
        while(l1!=null || l2!=null || left!=0){
            int a = l1 != null ? l1.val:0;
            int b = l2 != null ? l2.val:0;
            int sum = a+b+left;
            left = sum / 10;
            ListNode newNode = new ListNode(sum%10);
            cursor.next = newNode;
            cursor = newNode;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        return head.next;
    }
}
