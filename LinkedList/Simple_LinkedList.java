package com.LinkedList;
import java.util.Scanner;

class Node{
    int data;
    /*  It has reference of self type i.e., class name is Node && type of this reference is also Node (self referencing structures)  */
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class Simple_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
//        Node temp1 = new Node(20);
//        Node temp2 = new Node(30);
//        Node temp3 = new Node(40);
//        head.next = temp1;
//        temp1.next = temp2;
//        temp2.next = temp3;
        //System.out.println(head.data+" "+temp1.data+" "+temp2.data);
        PrintLL(head);
        System.out.println();
        PrintLL_Recursive(head);
        System.out.println("\nInsert at the begin of Singly Linked List:");
        head = InsertBegin(head,60);
        head = InsertBegin(head,70);
        head = InsertBegin(head,80);
        PrintLL(head);
        // head = null;
        System.out.println("\nInsert at the end of Singly Linked List:");
        head = InsertEnd(head, 100);
        head = InsertEnd(head, 200);
        head = InsertEnd(head, 300);
        PrintLL(head);
        System.out.println("\nDelete First Node of Singly Linked List:");
        head = DeleteFirst(head);
        PrintLL(head);
        //Node h = new Node(400);
        System.out.println("\nDelete Last Node of Singly Linked List:");
        head = DeleteLast(head);
        PrintLL(head);
    }

    public static Node InsertBegin(Node head, int x) { // TIME = O(1)
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    private static Node InsertEnd(Node head, int i) {
        Node temp = new Node(i);
        if(head==null) return temp;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static Node DeleteFirst(Node head) { // Time: O(1)
            if(head==null)
                return head;
            return head.next;
    }

    public static Node DeleteLast(Node head) {
        if(head==null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next.next!=null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;

    }

    public static void PrintLL_Recursive(Node head) { // TIME = O(n), AUXILIARY SPACE = O(n)
        if (head == null) return;
        System.out.print(head.data+" ");
        PrintLL_Recursive(head.next);
     }

    public static void PrintLL(Node head){ // TIME = O(n), NO AUXILIARY SPACE
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
