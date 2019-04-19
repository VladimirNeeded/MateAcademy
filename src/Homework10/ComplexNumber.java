package Homework10;

import java.util.Objects;

public final class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double re, double im) {
        this.real = re;
        this.imaginary = im;
    }

    public double getRe() {
        return real;
    }

    public double getIm() {
        return imaginary;
    }

    @Override
    public boolean equals(Object object) {
        ComplexNumber complexNumber = (ComplexNumber) object;
        if(object != null && this.getClass() == object.getClass()){
            if (this.imaginary == ((ComplexNumber) object).imaginary && this.real == ((ComplexNumber) object).real ){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
}