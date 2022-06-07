public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        if(headA==null || headB==null) return null;
        while(currentA!=null){
         ListNode currentB=headB;
            if(currentA==currentB) return currentA;
            while(currentB.next!=null && currentB.next!=currentA) currentB=currentB.next;
            if(currentB.next==null) currentA=currentA.next;
            else return currentA;
        }
        return currentA;

    }
}
