package homework4;

import java.util.Arrays;

public class MyArrayList <T> implements List<T> {
    int size = 0;
    int capacity = 0;
    T[] array;
   // int index = 0;

    public MyArrayList() {
        array = (T[]) new Object[capacity];
    }

    public MyArrayList(int size) {
        array = (T[]) new Object[size];
    }

    @Override
    public void add(T value) {
        if (array.length >= capacity){
            array = Arrays.copyOf(array, array.length + 1);
        }
        array[size] = value;
        size ++;
    }

    @Override
    public void add(T value, int index) {
        array = Arrays.copyOf(array, array.length + 1);
        for (int i = index; i < array.length - 1; i++) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    @Override
    public void addAll(List<T> list) {
        array = Arrays.copyOf(array, array.length + list.size());
        for (int i = array.length - list.size(), j = 0; i < array.length; i++, j++){
            array[i] = list.get(j);
        }
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void set(T value, int index) {
        array[index] = value;
    }

    @Override
    public T remove(int index) {
        T removedValue = array[index];
        for (int i = index; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        size--;
        array = Arrays.copyOf(array, array.length - 1);

        return removedValue;
    }

    @Override
    public T remove(T o) {
        int index = Arrays.asList(array).indexOf(o);
        for (int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        size--;
        array = Arrays.copyOf(array, array.length - 1);
        return o;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}


