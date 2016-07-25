package ru.sbertech.test.Lesson4.Homework;

import java.util.Iterator;

/**
 * Created by svetlanashmalko on 24.07.16.
 */
public class MyLinkedList<T> implements Iterable<T> {
    private Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;

    }

    private class Node {
        private T data;
        private Node next;
        Node prev;


        private Node(T data) {
            this.data = data;
            next = null;
            this.prev=null;
        }
    }

    public MyLinkedList<T> add(T element) {
        Node n = new Node(element);

        if (head == null) {
            head = n;

        } else {
            n.next = head;
            head = n;
        }
        size++;
        return this;
    }

    public MyLinkedList<T> add(int index, T element) {

        if (element == null) {
            System.out.println("Invalid element input!!");
        }
        if (index < 0 || index > size) {
            System.out.println(("Invalid index input!!"));
        }
        Node nodeToAdd = new Node(element);
        Node nodeAtIndex = head;
        for (int i = 0; i <= index; i++) {
            nodeAtIndex = nodeAtIndex.next;
        }

        Node prev = nodeAtIndex.prev;
        prev.next = nodeToAdd;
        nodeToAdd.prev = prev;
        nodeToAdd.next = nodeAtIndex;
        nodeAtIndex.prev = nodeToAdd;
        size++;
        return this;
    }




    public T get(int index){
        {
            // TODO: Implement this method.
            if (index < 0 || index > size - 1) {
                System.out.println(("Invalid index input!!"));
            }
            Node target = head;
            for (int i = 0; i <index; i++) {
                target = target.next;
            }
            T value = target.data;
            return value;
        }

    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> myIterator;
        myIterator = new Iterator<T>() {

            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if(hasNext()){
                    T data = current.data;
                    current = current.next;
                    return data;
                }
                return null;
            }

            @Override
            public void remove(){
                throw new UnsupportedOperationException("Remove not implemented.");
            }

        };
        return myIterator;



    }
}
