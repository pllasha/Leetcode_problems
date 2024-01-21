package leetcode;

public class Merg_Two_Sorted_Lists {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class MergeTwoSortedLists {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode();
            ListNode current = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }

            // If one of the lists is not empty, append the remaining nodes
            if (list1 != null) {
                current.next = list1;
            } else if (list2 != null) {
                current.next = list2;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args) {
        Merg_Two_Sorted_Lists outerClass = new Merg_Two_Sorted_Lists();
        MergeTwoSortedLists merger = outerClass.new MergeTwoSortedLists();

        ListNode list1 = outerClass.new ListNode(1, outerClass.new ListNode(2, outerClass.new ListNode(4)));
        ListNode list2 = outerClass.new ListNode(1, outerClass.new ListNode(3, outerClass.new ListNode(4)));

        ListNode mergedList = merger.mergeTwoLists(list1, list2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
