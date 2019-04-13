package homework4;

import java.util.ArrayList;

public interface List<T> {

    void add(T value);
    void add(T value, int index) throws Exception;
    void addAll(List<T> list) throws Exception;
    T get(int index) throws Exception;
    void set(T value, int index) throws Exception;
    T remove(int index) throws Exception; // возвращаем элемент, который удалили
    T remove(T t); // удалять первый, который встретится
    int size();
    boolean isEmpty();

}
