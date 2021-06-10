package com.LinkedList.DOUBLYLINKEDLIST;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int d){
        data  =d;
        prev = null;
        next = null;
    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next  = temp2;
        temp2.prev = temp1;
        printDLL(head);
        System.out.println("\nInsert at Begin of Doubly Linked List:");
        head = insertAtBegin(head, 40);
        printDLL(head);
        System.out.println("\nInsert at End of Doubly Linked List:");
        //head = null;
        head = insertAtEnd(head, 50);
        printDLL(head);
        System.out.println("\nReverse a Doubly Linked List:");
        head = reverse(head);
        printDLL(head);
        System.out.println("\nDelete Head of a Doubly Linked List");
        head = deleteHead(head);
        printDLL(head);
        System.out.println("\nDelete End of a Doubly Linked List");
        head = deleteEnd(head);
        printDLL(head);

    }

    public static Node insertAtBegin(Node head, int x) {
         Node temp = new Node(x);
         temp.next = head;
         if (head != null)
            head.prev = temp;
         return temp;
    }

    public static Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static Node deleteHead(Node head) {
        if(head == null || head.next == null)
            return null;
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteEnd(Node head) {
        if(head == null || head.next == null)
            return null;
        Node curr = head;
        /*while (curr.next.next != null){
            curr  =curr.next;
        }
        curr.next = null;*/
        while (curr.next != null){
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    public static Node reverse(Node head) {
          if(head == null || head.next == null)
              return head;
          Node curr  = head, prev = null;
          while(curr != null){
              prev = curr.prev;
              curr.prev = curr.next;
              curr.next = prev;
              curr = curr.prev;
          }
          return prev.prev;
    }


    public static void printDLL(Node head) {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
