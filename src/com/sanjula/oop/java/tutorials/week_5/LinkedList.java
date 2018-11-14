package com.sanjula.oop.java.tutorials.week_5;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList() {
        super();
        this.head = null;
        this.size = 0;
    }

    public boolean empty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void insertAtHead(T data){
        Node<T> newNode = new Node<>(data, head);//to create a new node
        head = newNode;//inserts at head
        size++;
    }

    public T deleteAtHead(){
        if (empty()) {
            throw new IllegalOperationException(
                    "Cannot delete data from an empty Linked List");
        }
        Node<T> deletedNode = head;
        head = head.getLink();
        size--;
        return deletedNode.getData();
    }

    public void traverse(){
        if (empty()) {
            throw new IllegalOperationException(
                    "Cannot traverse through data from an empty Linked List");
        }

        Node<T> current = head;

        while(current != null){
            System.out.println(current.getData());
            current = current.getLink();
        }
    }

    public void insertAtEnd(T data){
        if (empty()) {
            insertAtHead(data);
        } else {
            Node<T> current = head;

            while(current.getLink() != null){
                current = current.getLink();
            }

            Node<T> newNode = new Node<>(data, null);
            current.setLink(newNode);
            size++;
        }
    }

    public T deleteAtEnd(){
        if (empty()) {
            throw new IllegalOperationException(
                    "Cannot delete data from an empty Linked List");
        } else if (size() == 1){
            return deleteAtHead();
        } else {
            Node<T> current = head;
            Node<T> previous = null;
            while(current.getLink() != null){
                previous = current;
                current = current.getLink();
            }
            previous.setLink(null);
            size--;
            return current.getData();

        }
    }

    public void insertAfter(T after, T data){
        if (empty()) {
            throw new IllegalOperationException(
                    "Cannot insert after a given value since linked list is empty...");
        } else {
            Node<T> current = head;
            Node<T> next = head.getLink();

            while(next != null && !current.getData().equals(after)){
                current = next;
                next = next.getLink();
            }

            if (current.getData().equals(after)){
                Node<T> newNode = new Node<>(data, next);
                current.setLink(newNode);
                size++;
            } else {
                throw new IllegalOperationException(
                        "Cannot find the given value after which new node needs be inserted...");
            }
        }
    }

    public T delete(T dataToDelete){
        if (empty()) {
            throw new IllegalOperationException(
                    "Cannot delete since linked list is empty...");
        } else {
            Node<T> current = head;
            Node<T> previous = null;

            while(current != null && !current.getData().equals(dataToDelete)){
                previous = current;
                current = current.getLink();
            }

            if (current.getData().equals(dataToDelete)){
                previous.setLink(current.getLink());
                size--;
            } else {
                throw new IllegalOperationException(
                        "Cannot find the given value to be deleted...");
            }
            return current.getData();
        }

    }


}
