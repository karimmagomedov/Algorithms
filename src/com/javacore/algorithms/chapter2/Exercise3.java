package com.javacore.algorithms.chapter2;

public class Exercise3 {
    public static boolean deleteNode(Node n) {
        if (n == null || n.next == null) {
            return false; // Failure
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
