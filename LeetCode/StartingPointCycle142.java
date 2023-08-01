public class StartingPointCycle142 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if(head == null || head.next==null){
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            ListNode entry = head;
    
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
    
                if(slow == fast){
                    while(entry!=slow){
                        slow = slow.next;
                        entry = entry.next;
                    }
                    return entry;
                }
            }
            return null;
        }
    }
}
