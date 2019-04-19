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
        try {
            if (start > end || start < 0 || end > length()) {
                throw new Exception();
            }
            }catch (Exception e) {
                System.out.println("Uncorrected index");
                return (CharSequence) e;
            }
            byte[] newByteArray = new byte[end-start+1];
            for (int i = 0, j = start; j < newByteArray.length; j++, i++){
                newByteArray[i] = byteArray[j];
            }
            return new AsciiCharSequence(newByteArray);
    }

    @Override
    public String toString() {
        return new String(byteArray);
    }
}
