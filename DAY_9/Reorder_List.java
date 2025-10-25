import java.util.*;
public class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Reorder_List {
    public void reorderList(ListNode head) {
        if (head == null) return;
        // Step 1: Store values in ArrayList
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        // Step 2: Reorder values in list
        List<Integer> reordered = new ArrayList<>();
        int i = 0, j = list.size() - 1;
        while (i <= j) {
            if (i == j) reordered.add(list.get(i));
            else {
                reordered.add(list.get(i));
                reordered.add(list.get(j));
            }
            i++;
            j--;
        }
        // Step 3: Write reordered values back to linked list
        temp = head;
        int k = 0;
        while (temp != null) {
            temp.val = reordered.get(k++);
            temp = temp.next;
        }
        //TC->O(n)
        //SC->O(n)
    }
}
