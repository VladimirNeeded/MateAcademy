package Homework9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findMinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> listStream = new ArrayList<>();
        listStream = stream.collect(Collectors.toList());
        Stream<T> stream1 = listStream.stream();
        Stream<T> stream2 = listStream.stream();
        if (listStream.size() == 0) {
            minMaxConsumer.accept(null, null);
        }else {
            T min = (T) stream1.min(order).get();
            T max = (T) stream2.max(order).get();
            minMaxConsumer.accept(min, max);
        }
    }
}