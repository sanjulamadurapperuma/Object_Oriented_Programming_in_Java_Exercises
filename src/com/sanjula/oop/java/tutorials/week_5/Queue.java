package com.sanjula.oop.java.tutorials.week_5;

import java.util.ArrayList;

public class Queue<T> {
    private int maxSize;
    private ArrayList<T> queue = new ArrayList<>();

    public Queue(int size) {
        this.maxSize = size;
    }

    public void enQueue(T value){
        queue.add(value);
    }

    public T deQueue(){
        return queue.remove(0);
    }

    @Override
    public String toString() {
        return "Queue{" +
                "maxSize=" + maxSize +
                ", queue=" + queue +
                '}';
    }

    public static <T> void main(String[] args) {
        Queue newQueue = new Queue(5);
        newQueue.enQueue("a");
        newQueue.enQueue("b");
        newQueue.enQueue("c");
        newQueue.enQueue("e");
        newQueue.enQueue("f");
        System.out.println((T) newQueue.toString());
        System.out.println((T) newQueue.deQueue().toString());
        System.out.println((T) newQueue.deQueue().toString());
        System.out.println((T) newQueue.toString());
    }
}
