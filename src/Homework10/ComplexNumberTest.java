package Homework10;

public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1.1, 1);
        ComplexNumber complexNumber2 = new ComplexNumber(1.1, 1);

        System.out.println(complexNumber.equals(complexNumber2));

        System.out.println(complexNumber.hashCode());
        System.out.println(complexNumber2.hashCode());
    }
}
