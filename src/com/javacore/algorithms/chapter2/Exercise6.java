package com.javacore.algorithms.chapter2;

public class Exercise6 {
    public static boolean isPalindrome(Node head) {
        Node reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    public static Node reverseAndClone(Node node) {
        Node head = null;
        while (node != null) {
            Node n = new Node(node.data); // Clone
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    public static boolean isEqual(Node one, Node two) {
        while (one != null && two != null) {
            if (one.data != two.data) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }
}
