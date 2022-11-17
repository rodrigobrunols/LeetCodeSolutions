package org.lab.solutions.leetcode;


/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
public class _876_MiddleOfLinkedList {

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Time: O(n + n/2)
     * Space: O(1)
     *
     * @param head list size n
     * @return
     */
    public ListNode solution1(ListNode head) {

        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        int middle = count % 2 == 0 ? (count / 2) + 1 : (count / 2) + 1;

        ListNode middleNode = head;

        int m = 1;

        while (m != middle) {
            middleNode = middleNode.next;
            m++;
        }

        return middleNode;
    }

    /**
     *   Time: O(n)
     *   Space: O(n)
     *
     * @param head
     * @return
     */
    public ListNode solution2(ListNode head) {
        ListNode[] nodeList = new ListNode[100];

        int l =0;

        while(head != null){
            nodeList[l++] = head;
            head = head.next;
        }

        return nodeList[l/2];

    }

    /**
     * Time O(n/2)
     * Space O(1)
     * @param head
     * @return
     */
    public ListNode solution3(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }



    public static void main(String[] args) {

        //Input: head = [1,2,3,4,5]
        //Output: [5,4,3,2,1]
    }
}
