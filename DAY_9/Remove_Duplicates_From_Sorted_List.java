public class Remove_Duplicates_From_Sorted_List {
    
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode a=head;
        while(a!=null && a.next!=null){
            if(a.val==a.next.val){
                a.next=a.next.next;
            }
            else{
                a=a.next;
            }
        }
        return head;
    }
}
