package Homework3;

public class Merge {

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] resultArray = new int[array1.length + array2.length];
        int indexOfArray1 = 0;
        int indexOfArray2 = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (indexOfArray1 > array1.length - 1) {
                resultArray[i] = array2[indexOfArray2++];
            } else if (indexOfArray2 > array2.length - 1) {
                resultArray[i] = array1[indexOfArray1++];
            } else if (array1[indexOfArray1] < array2[indexOfArray2]) {
                resultArray[i] = array1[indexOfArray1++];
            }
            else {
                resultArray[i] = array2[indexOfArray2];
                indexOfArray2++;
            }
        }
        return resultArray;
    }

    protected static void drawArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}