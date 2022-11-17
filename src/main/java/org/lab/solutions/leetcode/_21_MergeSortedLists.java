package org.lab.solutions.leetcode;


/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * Example 1:
 * <p>
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 * <p>
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 * <p>
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */
public class _21_MergeSortedLists {

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
     * Space: O(n+m)
     * Time: O(n+m)
     *
     * @param list1 list size n
     * @param list2 list size m
     * @return
     */
    public ListNode solutuion1(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;

        if (list2 == null) return list1;

        ListNode head;

        //compare the 2 heads
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        head.next = solutuion1(list1, list2);

        return head;
    }

    /**
     * Time O(n + m)
     * Space O(1)
     *
     * @param l1 list size n
     * @param l2 list size m
     *
     * @return
     */
    public ListNode solution2(ListNode l1 , ListNode l2){

        ListNode head = new ListNode();
        ListNode tail = head;

        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 == null ? l2 : l1);

        return head.next;

    }


    public static void main(String[] args) {

    }
}
