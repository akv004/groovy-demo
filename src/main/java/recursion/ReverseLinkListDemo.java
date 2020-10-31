package recursion;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class ReverseLinkListDemo {

    public static void main(String args[]){
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);

        ListNode b = reverseList(a);

//        while (a != null){
//            System.out.print(" "+ a.val);
//            a = a.next;
//        }
        while (b != null){
            System.out.print(" "+ b.val);
            b = b.next;
        }


    }
    static ListNode reverseList(ListNode head) {
     if(head ==null || head.next ==null) return head;
       ListNode p =  reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
     }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
}


