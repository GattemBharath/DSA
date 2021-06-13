package com.Queue;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class QueueLinkedList {
    Node front,rear;
    int size;
    QueueLinkedList(){
        front = rear = null;
        size = 0;
    }

    public void enqueue(int x) {
        Node temp = new Node(x);
        size++;
        if(front == null) { // ADDING FIRST ELEMENT TO QUEUE
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;

        System.out.println("Queue Size after enqueue: " + size()+" element added is  "+rear.data);
    }

    public void dequeue() {
        if(front == null)
            return;
        front = front.next;
        if(front == null) // AFTER DELETING LAST ELEMENT FROM QUEUE
            rear = null;
        size--;
        System.out.println("Queue Size after dequeue: " + size());
    }

    public int size() {
        return size;
    }

    public int getFront() {
        return front.data;
    }

    public int getRear() {
        return rear.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

class TestQueue2{
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        System.out.println("Queue Size : " + q.size());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        System.out.println(q.isEmpty());
        q.enqueue(80);
        System.out.println("Queue Front : " + q.front.data);
        System.out.println("Queue Rear : " + q.rear.data);
    }
}

