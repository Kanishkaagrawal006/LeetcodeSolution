public class Question19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) {
            return head;
        }
        if (head == null || head.next == null) {
            return null;
        }
        int requiredindex = getsize(head)-n;
        if(requiredindex==0){
            return head.next;
        }

        ListNode current = head;
        for (int i = 0; i < requiredindex - 1; i++) {

                current = current.next;

            }
        current.next = current.next.next;

        return head;
    }

    public static int getsize(ListNode head) {
        int size = 0;
        while (head!= null) {
            head = head.next;
            size++;
        }
        return size;
    }
}
