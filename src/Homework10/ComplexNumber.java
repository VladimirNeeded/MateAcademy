package Homework10;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object object) {
        ComplexNumber complexNumber = (ComplexNumber) object;
        if(object != null && this.getClass() == object.getClass()){
            if (this.im == ((ComplexNumber) object).im && this.re == ((ComplexNumber) object).re ){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}