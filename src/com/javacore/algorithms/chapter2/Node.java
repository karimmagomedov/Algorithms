package com.javacore.algorithms.chapter2;

public class Node {
    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    void appendToTail(int data) {
        Node end = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = this.next;
        }
        n.next = end;
    }


    Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d)
            return head.next;

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    void printLinkedList(){

            System.out.print(this.data);

    }
}
