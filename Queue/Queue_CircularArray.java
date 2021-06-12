package com.Queue;

import java.util.Arrays;
                                             /* EFFICIENT IMPLEMENTATION USING CIRCULAR ARRAY */
public class Queue_CircularArray {
    int[] arr;
    int size;
    int cap;
    int front;
    Queue_CircularArray(int c)
    {
        cap = c;
        arr= new int[cap];
        size = 0;
        front = 0;
    }

    public void enqueue(int x) { // TIME : O(1)
        if (isFull())
            return;
        int rear = getRear();
        rear = (rear+1) % cap;
        arr[rear] = x;
        size++;
        System.out.println(Arrays.toString(arr) + "rear is: " + rear);
    }

    public void dequeue() { // TIME : O(1)
        if (isEmpty()){
            return;
        }
        front  = (front+1) % cap;
        size--;
    }

    public int size() {
        return size;
    }

    public int getFront() {
        if(isEmpty())
            return -1;
        return front;
    }

    public int getRear() {
        if(isEmpty())
            return -1;
        return (front + size - 1) % cap;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == cap;
    }
}

class TestQueue1{
    public static void main(String[] args) {
        Queue_CircularArray q = new Queue_CircularArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        System.out.println(q.size());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        System.out.println(q.isEmpty());
        q.enqueue(80);
        System.out.println(q.isFull());
    }
}

