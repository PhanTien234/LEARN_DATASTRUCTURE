package implementations;
import interfaces.List;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 4;
    private Object[] elements;
    private int size;

    public ArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    @Override
    public boolean add(E element) {
        if (elements.length == size){
            elements = grow();
        }
        elements[size++] = element;
        return true;
    }
    private Object[] grow(){
        return Arrays.copyOf(elements, elements.length*2);
    }

    @Override
    public boolean add(int index, E element) {
        checkIndex(index);
        if (elements.length ==size){
            elements = grow();
        }
        for (int i = size;i>=index +1;i--){
            elements[i] =elements[i-1];
        }
        elements[index]= element;
        size++;
        return true;
    }
    private void checkIndex(int index){
        if (index<0 ||index>=size) throw new IndexOutOfBoundsException("Index out of bound:"
                +index +" out of "+size);
    }
    private E getElement(int index){
        return (E)elements[index];
    }
    @Override
    public E get(int index) {
        checkIndex(index);
        return getElement(index);
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        elements[index] = element;
        return null;
    }
    private Object[] shrink(){
        return Arrays.copyOf(elements,elements.length/2);
    }
    private void ensureCapacity(){
        if (size < elements.length/3) {
            elements = shrink();
        }

    }
    public int getCapacity(){
        return elements.length;
    }
    @Override
    public E remove(int index) {
        checkIndex(index);
        E element = getElement(index);
        for (int i=index;i<size-1;i++){
            elements[i] = elements[i+1];
        }
        size--;
        ensureCapacity();
        return element;
    }

    @Override
    public int size() {
        return size;
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        // result.append();
        for (int i = 0;i<size;i++){
            if (i==size-1) result.append(elements[i]);
            else result.append(elements[i]+"\n");
        }
        return result.toString();
    }
    @Override
    public int indexOf(E element) {
        for (int i=0;i<size;i++){
            if (elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) !=-1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public E next() {
                E element = getElement(index);
                index++;
                return element;
            }
        };
    }
}

