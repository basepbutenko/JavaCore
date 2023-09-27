package Courses;

import java.util.Arrays;

public class ObjectStack {
    private Object[] stackArray;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ObjectStack() {
        stackArray = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(Object obj) {
        if (size == stackArray.length) {
            // Увеличиваем размер массива, если стек заполнен
            ensureCapacity();
        }
        stackArray[size++] = obj;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        Object poppedObject = stackArray[--size];
        stackArray[size] = null; // Для избежания утечек памяти
        return poppedObject;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return stackArray[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = stackArray.length * 2;
        stackArray = Arrays.copyOf(stackArray, newCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(stackArray[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        ObjectStack stack = new ObjectStack();

        stack.push("Элемент 1");
        stack.push("Элемент 2");
        stack.push("Элемент 3");

        System.out.println("Стек: " + stack);

        System.out.println("Вершина стека: " + stack.peek());

        System.out.println("Извлекаем элемент: " + stack.pop());
        System.out.println("Стек после извлечения: " + stack);
    }
}
