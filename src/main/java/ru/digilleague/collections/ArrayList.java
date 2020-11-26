package ru.digilleague.collections;


public class ArrayList<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_SIZE = 50;

    public ArrayList() {
        elements = new Object[DEFAULT_SIZE];

    }

    public ArrayList(Object[] elements) {
        this.elements = elements;
        this.size = elements.length;
    }

    public void add(E element) {
        if (size== elements.length-1)
            resize(elements.length+50);
        elements[size++]=element;
    }

    private void resize(int length) {
        Object[] newElements = new Object[length];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public Object get(int index) {
        if (index < size) {
            return elements[index];
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean remove() {
        size = 0;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

}
