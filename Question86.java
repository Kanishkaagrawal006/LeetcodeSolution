public class Question86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode less = new ListNode(0);
        ListNode more = new ListNode(0);
        ListNode lesshead= less;
        ListNode morehead = more;
        while(head!=null){
            if(head.val < x){
                lesshead.next = head;
                lesshead=lesshead.next;
            }
            else{
                morehead.next = head;
                morehead=morehead.next;

            }
            head=head.next;
        }
        morehead.next=null;
        lesshead.next = more.next;
        return less.next;
    }
    public class ListNode {
    int val;
    ListNode next;
   ListNode() {}
    ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

}
