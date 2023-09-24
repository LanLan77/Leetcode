class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }  
}


public class Solution {

    public static void main(String[] args) {
        // 创建两个测试用例链表
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // 调用 addTwoNumbers 方法
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // 打印结果
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
            if (result != null) {
                System.out.print(" -> ");
            }
        }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
