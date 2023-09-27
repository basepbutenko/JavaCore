package Courses;

import java.util.EmptyStackException;

public class GenericStack<E> {
    private Node<E> top;
    private int size;

    // Внутренний класс для узла стека
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public GenericStack() {
        top = null;
        size = 0;
    }

    // Помещение элемента на вершину стека
    public void push(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Извлечение элемента с вершины стека
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Просмотреть элемент на вершине стека без извлечения
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Проверить, пуст ли стек
    public boolean isEmpty() {
        return size == 0;
    }

    // Вернуть размер стека
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Стек: " + stack);

        System.out.println("Вершина стека: " + stack.peek());

        System.out.println("Извлекаем элемент: " + stack.pop());
        System.out.println("Стек после извлечения: " + stack);
    }

}
/*
 *
 * */