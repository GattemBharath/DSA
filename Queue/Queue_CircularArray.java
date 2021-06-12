package com.Queue;

import java.util.Arrays;

public class Queue_CircularArray {
    int[] arr;
    int size;
    int cap;
    QueueArray(int c)
    {
        cap = c;
        arr= new int[cap];
        size = 0;
    }

    public void enqueue(int x) { // TIME : O(1)
        if (isFull())
            return;
        arr[size] = x;
        size++;
        System.out.println(Arrays.toString(arr) + "rear is: " + size);
    }

    public void dequeue() { // TIME : O(n)
        if (isEmpty()){
            return;
        }
        for(int i = 0;i < size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    public int getFront() {
        if(isEmpty())
            return -1;
        return 0;
    }

    public int getRear() {
        if(isEmpty())
            return -1;
        return size-1;
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
        QueueArray q = new QueueArray(5);
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

