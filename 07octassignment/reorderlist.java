import java.util.*;
class Solution{
    public void reorderList(ListNode head){
        if(head==null||head.next==null)return;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null,cur=slow.next,next;
        slow.next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        ListNode first=head,second=prev;
        while(second!=null){
            ListNode temp1=first.next,temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}
