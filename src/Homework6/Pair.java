package Homework6;

import java.util.Objects;

public class Pair<F, S> {
    private F firstValue;
    private S secondValue;

    Pair(F firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public F getFirstValue(){
        return firstValue;
    }

    public S getSecondValue(){
        return secondValue;
    }

    public boolean equals(Object pair){
//        return this != null && this.getClass() == pair.getClass() &&
//        this.firstValue == pair.firstValue && this.secondValue == pair.secondValue;
        if (pair == this) {
            return true;
        }
        if (pair == null || pair.getClass() != this.getClass()) {
            return false;
        }
        Pair comparedPair = (Pair) pair;
        return (firstValue == comparedPair.firstValue ||
               (firstValue != null && firstValue.equals(comparedPair.getFirstValue()))) &&
               (secondValue == comparedPair.secondValue ||
               (secondValue != null && secondValue.equals(comparedPair.getSecondValue())));
    }

    public int hashCode(){
        return Objects.hash(firstValue, secondValue);
    }

    public static Pair of(Object firstVlaue, Object secondValue){
        return new Pair(firstVlaue, secondValue);
    }
}