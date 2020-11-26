package ru.digilleague.collections;


public class ArrayList<E> {
    private Object[] elements;
    private int size = 0;
    private int positionElement = 0;
    private static final int DEFAULT_SIZE = 50;

    public ArrayList() {
        elements = new Object[DEFAULT_SIZE];

    }

    public ArrayList(Object[] elements) {
        this.elements = elements;
        this.size = elements.length;
        positionElement = size - 1;
    }

    public boolean add(E element) {
        if (size == elements.length) {
            int newRazmer = size *2;
            Object[] newArray = new Object[newRazmer];
            for (int i =0; i < elements.length; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
            elements[++positionElement] = element;
            size = positionElement + 1;
        } else {
            elements[positionElement] = element;
            size = positionElement + 1;
            positionElement++;
        }

        return true;
    }

    public E get(int index) {
        if (index < size) {
            return (E)elements[index];
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
