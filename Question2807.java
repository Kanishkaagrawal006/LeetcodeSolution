public class Question2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current=head;
        while (current!=null && current.next != null) {
            int gcd= gcd(current.val, current.next.val);
            ListNode divisor = new ListNode(gcd);
            divisor.next = current.next;
            current.next = divisor;
            current = divisor.next;

        }
        return head;

    }
    public static int gcd(int a,int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int value,ListNode next) {
            this.next = next;
            this.val = val;
        }

        public ListNode(int val) {
            this.val = val;
        }

    }

}
