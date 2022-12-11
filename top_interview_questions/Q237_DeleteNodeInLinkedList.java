package top_interview_questions;

public class Q237_DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }

}
