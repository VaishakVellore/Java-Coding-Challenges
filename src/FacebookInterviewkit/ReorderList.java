package FacebookInterviewkit;

public class ReorderList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode next = head.next;
        ListNode prev = head;
        ListNode end = head;


        while(end.next != null){ //calculate End node
            end = end.next;
        }
        ListNode prevEnd = null;

        while(next != null && next.next != null){
            prevEnd = getPreNode(head, end); // last but one node. this will be end once end node is moved
            prev.next = end;
            end.next = next;
            next = next.next;
            prevEnd.next = null; // our purpose is done here.

            //we are doing to repoint the pointers
            prev = end.next;
            next = prev.next;
            end = prevEnd;
        }
        printlist(head);
    }

    //method to find previous node
    public static ListNode getPreNode(ListNode head, ListNode end){
        ListNode prevEnd = head;
        while(prevEnd.next != end){
            prevEnd = prevEnd.next;
        }
        return prevEnd;
    }
    public static void  printlist(ListNode node) {
        if (node == null) {
            return;
        }
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }

        public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next =new ListNode(5);
        System.out.println("The initial order is");
            printlist(l1);
            System.out.println("\nThe final order is");
        reorderList(l1);
        }
    }
