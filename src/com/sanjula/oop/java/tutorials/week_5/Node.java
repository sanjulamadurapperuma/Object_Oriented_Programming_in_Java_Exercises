package com.sanjula.oop.java.tutorials.week_5;

public class Node<T> {

    private T data;
    private Node<T> link;

    public Node(T data, Node<T> link) {
        super();
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLink() {
        return link;
    }

    public void setLink(Node<T> link) {
        this.link = link;
    }

}
