public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        //edge case
        if(head==null || head.next==null || k==0){
            return head;
        }
        //compute the length
        ListNode curr = head;
        int len = 1;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        //go till that node
        curr.next = head;
        k=len-k % len;
        while(k-- > 0){
            curr = curr.next;
        }
        //make the node head ad break the connection
        head = curr.next;
        curr.next = null;
        return head;
    }
    
}
