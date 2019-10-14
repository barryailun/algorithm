package top.sstime.algorithm;

import java.util.Iterator;

/**
 * 使用双链表实现
 * @param <T>
 */
public class MyLinkedList<T> implements Iterable<T> {

    private int theSize;
    private int modCount = 0;
    private Node<T> beginMarker;
    private Node<T> endMarker;

    /**
     * 一个节点包含的数据以及到前一个节点的链和下一个节点的链
     * @param <T>
     */
    private static class Node<T> {
        public T data;
        public Node<T> prev;
        public Node<T> next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public MyLinkedList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    private void doClear() {
        beginMarker = new Node<>(null, null, null);
        endMarker = new Node<>(null, beginMarker, null);
        beginMarker.next = endMarker;
        theSize = 0;
        modCount++;
    }

    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean add(T x) {
        add(size(), x);
        return true;
    }

    private void add(int idx, T x) {
        addBefore(getNode(idx, 0, size()), x);
    }

    private void addBefore(Node<T> node, T x) {
    }

    private Node<T> getNode(int idx, int i, int size) {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class LinkedListIterator implements Iterator<T> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
}
