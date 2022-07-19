package com.fl.LinkedList;

/**
 * LinkedList
 *
 * @author fulu
 * {@code @date} 2022/7/19 15:41
 * {@code @description} 链表
 */
public class LinkedList<T> {
    private Node<T> head = null;

    /**
     * 尾插
     *
     * @param value 节点值
     */
    public void insertTail(T value) {
        Node<T> newNode = new Node<T>(value, null);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> q = head;
        while (q.next != null) {
            q = q.next;
        }
        q.next = newNode;
    }

    /**
     * 头插
     *
     * @param value 节点值
     */
    public void insertHead(T value) {
        Node<T> newNode = new Node<>(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * 通过节点值删除
     *
     * @param value 值
     */
    public void deleteByValue(T value) {
        if (head == null) {
            return;
        }

        Node<T> p = head;
        Node<T> q = null;
        while (p != null && p.data != value) {
            q = p;
            p = p.next;
        }

        //知道最后也没找到
        if (p == null) {
            return;
        }
        // 如果删除的节点是头结点
        if (q == null) {
            head = head.next;
        } else {
            q.next = q.next.next;
        }

    }

    /**
     * 通过节点删除
     *
     * @param node 节点
     */
    public void deleteByNode(Node<T> node) {
        if (head == null) {
            return;
        }
        // 头结点情况
        if (node == head) {
            head = head.next;
            return;
        }

        Node<T> p = head;
        while (p != null && p.next != node) {
            p = p.next;
        }
        // 到最后没找到
        if (p == null) {
            return;
        }

        p.next = p.next.next;
    }

    /**
     * 通过节点值找节点
     *
     * @param value 值
     * @return 节点
     */
    public Node<T> findByValue(T value) {
        if (head == null) {
            return null;
        }

        Node<T> p = head;
        while (p != null && p.data != value) {
            p = p.next;
        }

        return p;
    }

    /**
     * 通过脚标找节点
     *
     * @param index 脚标
     * @return 节点
     */
    public Node<T> findByIndex(int index) {
        Node<T> p = head;
        int pos = 0;
        while (p != null && pos != index) {
            p = p.next;
            ++pos;
        }

        return p;
    }

    /**
     * 打印链表
     */
    public void printAll() {
        Node<T> p = head;
        while (p != null) {
            System.out.printf(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }


}



 