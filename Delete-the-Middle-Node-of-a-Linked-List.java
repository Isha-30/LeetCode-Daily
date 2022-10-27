class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev!=null)
            prev.next = slow.next;
        else
            return null;
        return head;
    }
}
