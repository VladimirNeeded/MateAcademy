package homework2;

public class SortUtils {

    public static int[] createArray(int amountOfElements) {
        int[] arr = new int[amountOfElements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void swap(int firstIndex, int secondIndex, int[] array) {
        int box = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = box;
    }

    public static void drawArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static int[] sortBubble(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1, array);
                }
            }
        }
        return array;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int i = 0, j = 0;
        int[] resultArray = new int[array1.length + array2.length];
        for (int k = 0; k < resultArray.length; k++) {
            if (i > array1.length - 1) {
                int a = array2[j];
                resultArray[k] = a;
                j++;
            } else if (j > array2.length - 1) {
                int a = array1[i];
                resultArray[k] = a;
                i++;
            } else if (array1[i] < array2[j]) {
                int a = array1[i];
                resultArray[k] = a;
                i++;
            } else {
                int b = array2[j];
                resultArray[k] = b;
                j++;
            }
        }
        return sortBubble(resultArray);
    }
}