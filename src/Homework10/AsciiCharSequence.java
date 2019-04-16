package Homework10;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArray[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] newByteArray = new byte[end-start+1];
        for (int i = 0, j = start; j < newByteArray.length; j++, i++){
            newByteArray[i] = byteArray[j];
        }
        CharSequence asciiCharSequence = new AsciiCharSequence(newByteArray);
        return asciiCharSequence;
    }

    @Override
    public String toString() {
        String stringOfChar = new String(byteArray);
        return stringOfChar;
    }
}
