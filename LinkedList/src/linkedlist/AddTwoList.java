package linkedlist;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int x)
    {
        val = x;
        next = null;
    }
}

public class AddTwoList {
    public static ListNode addup(ListNode first, ListNode second) {
        ListNode result = new ListNode(0);
        rec(first, second, 0, result);
        return result.next;
    }
    
    public static void rec(ListNode first, ListNode second, int carry,  ListNode result) {
        if (first == null && second == null) {      //if both are null
            if (carry != 0) {   // but it may has a carry.
                result.next = new ListNode(carry);
            }
            return;                                  //stop
        } else if (first == null || second == null) { // if one of them is null
            if (first == null) { // if it is first
                result.next = new ListNode((second.val + carry)%10); // set next to second's value
                rec(null, second.next, (second.val + carry) / 10, result.next);
            } else {                                        //if it is second
                result.next = new ListNode((first.val + carry)%10); // set next to first
                rec(first.next, null, (first.val + carry) / 10, result.next);
            }
        } else { //if both are not null
            result.next = new ListNode((first.val + second.val + carry) % 10); // set next to both
            rec(first.next, second.next, (first.val + second.val + carry) / 10, result.next);// return with carry
        }
        
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(7);
        first.next = new ListNode(1);
        first.next.next = new ListNode(6);
        ListNode second = new ListNode(5);
        second.next = new ListNode(9);
        second.next.next = new ListNode(2);
        
        ListNode head =  addup(first, second);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println(" ");
    }
}




// addTwoList(l1, l2, carry) = addTwoList(l1.next, l2.next, carry')
// stop condition : (l1 == null && l2 == null && carry == 0)