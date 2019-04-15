package Homework9;

import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Comparator comparator = new Comparator();
        Stream<Integer> stream = Stream.of(2, 5, 1, 4, 3, 11);
        BiConsumer<Object, Object> minMaxConsumer = (min, max) -> System.out.println("min: " + min + " max: " + max);
        findMinMax.findMinMax(stream, comparator, minMaxConsumer);
    }
}
