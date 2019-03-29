package Homework3;

public class MergeMain extends Merge {
    public static void main (String[] args){
        int[] array1 = {1, 3, 5, 7, 10, 12};
        int[] array2 = {2, 4, 8, 9, 11, 15};
        drawArray(array1);
        drawArray(array2);
        drawArray(mergeArrays(array1, array2));

    }
}
