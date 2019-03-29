package Homework3;

public class Merge {

    public static void main (String[] args){
    int[] array1 = {1, 3, 5, 7, 10, 12};
    int[] array2 = {2, 4, 8, 9, 11, 15};
    drawArray(array1);
    drawArray(array2);
    drawArray(mergeArrays(array1, array2));

    }
    public static int[] mergeArrays(int[] array1, int[] array2) {

        int[] array3 = new int[array1.length + array2.length];
        int indexOfArray1 = 0;
        int indexOfArray2 = 0;
        for (int i = 0; i < array3.length; i++) {
            if (indexOfArray1 > array1.length - 1) {
                array3[i] = array2[indexOfArray2];
                indexOfArray2++;
            }
            else if (indexOfArray2 > array2.length - 1) {
                array3[i] = array1[indexOfArray1];
                indexOfArray1++;
            }
            else if (array1[indexOfArray1] < array2[indexOfArray2]) {
                array3[i] = array1[indexOfArray1];
                indexOfArray1++;
            }
            else {
                array3[i] = array2[indexOfArray2];
                indexOfArray2++;
            }
        }
        return array3;
    }
    public static void drawArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
