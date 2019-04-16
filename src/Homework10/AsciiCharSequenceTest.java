package Homework10;

public class AsciiCharSequenceTest {
    public static void main(String[] args) {
        byte[] arrayOfChar = {'m', 'a', 't', 'e', ' ', 'a', 'c', 'a', 'd', 'e', 'm', 'y'};
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(arrayOfChar);
        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.charAt(1));
        System.out.println(asciiCharSequence.toString());
        System.out.println(asciiCharSequence.subSequence(0, 4));

    }
}
