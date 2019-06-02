package com.javacore.algorithms.chapter2;

public class Exercise1 {
    static void removeDuplicates(Node head) {
        Node current = head;
        while (current!=null) {
            Node runner = current;
            while (runner.next!=null) {
                if (runner.next.data == current.data)
                    runner.next = runner.next.next;
                else
                    runner = runner.next;
            }
            current = current.next;
        }
    }
}
