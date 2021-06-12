package com.Queue;

import java.util.Arrays;

public class QueueArray {
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

class TestQueue{
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
/* QueueArray(int c)
     {
         cap = c;
         arr= new int[cap];
         front = 0;
         rear = -1;
     }

    public void enqueue(int i) {
         if (rear >= cap-1){
             System.out.println("Queue is FUll");
         }
         else {
             rear++;
             arr[rear] = i;
             System.out.println(Arrays.toString(arr) + "rear is: " + rear);
         }
    }

    public int dequeue() {
         if (front > rear){
             System.out.println("Queue is EMPTY");
         }
         int res = arr[front];
         front++;
         return res;
    }

    public int size() {
         return rear;
    }

    public int getFront() {
         return arr[front];
    }

    public int getRear() {
         return arr[rear];
    }

    public boolean isEmpty() {
         return front-1 == rear;
    }

    public boolean isFull() {
         return rear >= cap-1;
    }*/