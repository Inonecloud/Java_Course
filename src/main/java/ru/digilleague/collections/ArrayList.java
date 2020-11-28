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

    public boolean add(E element) {
        if (size > 0 ) {
            if (size == elements.length) {
                while (elements[size - 1] == null) {
                    size--;
                    if (size == 0) break;
                }
                if(size == elements.length) {
                    Object[] newArray = new Object[elements.length + 50];
                    System.arraycopy(elements, 0, newArray, 0, size);
                    elements = newArray;
                }
                elements[size++] = element;

            } else {
                while (elements[size - 1] == null) {
                    size--;
                    if (size == 0) break;
                }
                if (size != 0) {
                    Object[] newArray = new Object[elements.length+1];
                    System.arraycopy(elements, 0, newArray, 0, size);
                    elements = newArray;
                }
                elements[size++] = element;
            }
        }
        else {
            if(elements.length < 1){
                Object[] newArray = new Object[elements.length+50];
                elements = newArray;
            }
            elements[size++] = element;
        }
        return true;
    }

    public Object get(int index) {
        if (index < size) {
            return elements[index];
        }else {
            return "IndexOutOfBoundsException";
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
