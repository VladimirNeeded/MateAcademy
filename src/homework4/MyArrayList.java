package homework4;

import java.util.Arrays;

public class MyArrayList <T> implements List<T> {
    int size = 0;
    private int capacity = 0;
    T[] array;

    public MyArrayList() {
        array = (T[]) new Object[capacity];
    }

    public MyArrayList(int size) {
        array = (T[]) new Object[size];
    }

    @Override
    public void add(T value) {
        if (array.length >= capacity){
            array = (T[]) increaseCapacity(array);
        }
        array[size] = value;
        size ++;
    }

    @Override
    public void add(T value, int index) {
        if (checkIndex(index)) {
            array = (T[]) increaseCapacity(array);
            for (int i = index; i < array.length - 1; i++) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }
    }

    @Override
    public void addAll(List<T> list) {
        array = Arrays.copyOf(array, array.length + list.size());
        for (int i = array.length - list.size(), j = 0; i < array.length; i++, j++){
            array[i] = list.get(j);
            size++;
        }
    }

    @Override
    public T get(int index) {
        if (checkIndex(index)) {
            return array[index];
        }
        return null;
    }

    @Override
    public void set(T value, int index) {
        if (checkIndex(index)) {
            array[index] = value;
        }
    }

    @Override
    public T remove(int index) {
        if (checkIndex(index)) {
            T removedValue = array[index];
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            array = Arrays.copyOf(array, array.length - 1);

            return removedValue;
        }
        return null;
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
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    protected static Object[] increaseCapacity(Object[] array){
        return array = Arrays.copyOf(array,array.length + 1);
    }

    protected boolean checkIndex(int index){
        if (index < 0 || index > this.size){
            return false;
        }
        return true;
    }
}