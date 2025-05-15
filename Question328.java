public class Question328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode evenHead = even;
        ListNode oddHead = odd;
        int counter =0;
        while(head!=null){
            counter++;
            if(counter%2==0){
                evenHead.next = head;
                evenHead = evenHead.next;
            }
            else{
                oddHead.next = head;
                oddHead = oddHead.next;
            }
            head = head.next;
        }
        evenHead.next = null;
        oddHead.next = even.next;
        return odd.next;

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
