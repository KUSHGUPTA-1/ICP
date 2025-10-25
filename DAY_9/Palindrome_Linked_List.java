import java.util.*;
public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        List<Integer> l1=new ArrayList<>();
        ListNode a=head;
        while(a!=null){  //List khali toh nhi hai.
            l1.add(a.val);
            a=a.next;
        }
        int l=0;
        int r=l1.size()-1;
        while(l<r){
            if(!l1.get(l).equals(l1.get(r))){   //First and Last ko compare kra.
                return false;       //Not matches then false.
            }
            l++;
            r--;
        }
        return true;
        //TC->O(n);
        //SC->O(n);
    }
}
