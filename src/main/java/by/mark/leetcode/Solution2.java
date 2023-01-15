package by.mark.leetcode;


/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>
 */
class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int currentNodeValue = sum % 10;
        int nextRankValueToAdd = sum / 10;

        ListNode nextNode = addTwoNumbers(nextRankValueToAdd, l1.next, l2.next);

        return new ListNode(currentNodeValue, nextNode);
    }

    public ListNode addTwoNumbers(int valueToAdd, ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null && valueToAdd == 0) {
            return null;
        } else if (l1 == null && l2 == null) {
            return new ListNode(valueToAdd);
        }

        int leftValue = l1 == null ? 0 : l1.val;
        int rightValue = l2 == null ? 0 : l2.val;

        int sum = leftValue + rightValue + valueToAdd;
        int currentNodeValue = sum % 10;
        int nextRankValueToAdd = sum / 10;

        ListNode nextLeft = l1 == null ? null : l1.next;
        ListNode nextRight = l2 == null ? null : l2.next;

        ListNode nextNode = addTwoNumbers(nextRankValueToAdd, nextLeft, nextRight);

        return new ListNode(currentNodeValue, nextNode);
    }

    static class ListNode {

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
}
