package Homework3;

public class MergeMain {
    public static void main (String[] args){
        int[] array1 = {1, 3, 5, 7, 10, 12};
        int[] array2 = {2, 4, 8, 9, 11, 15};
        Merge.drawArray(array1);
        Merge.drawArray(array2);
        Merge.drawArray(Merge.mergeArrays(array1, array2));

    }
}
