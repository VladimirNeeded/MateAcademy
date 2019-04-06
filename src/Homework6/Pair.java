package Homework6;

import java.util.Objects;

public class Pair<F, S> {
    private F firstValue;
    private S secondValue;

    Pair(F firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    protected F getFirstValue(){
        return firstValue;
    }

    protected S getSecondValue(){
        return secondValue;
    }

    public boolean equals(Pair pair){
        return this != null && this.getClass() == pair.getClass() &&
        this.firstValue == pair.firstValue && this.secondValue == pair.secondValue;
    }

    public int hashCode(){
        return Objects.hash(firstValue, secondValue);
    }

    public static Pair of(Object firstVlaue, Object secondValue){
        return new Pair(firstVlaue, secondValue);
    }
}