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

    public static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0, j = 0, k = 0; k < resultArray.length; k++, i++, j++) {
            if (i > firstArray.length - 1) {
                int currentElement = secondArray[j];
                resultArray[k] = currentElement;
            } else if (j > secondArray.length - 1) {
                int currentElement = firstArray[i];
                resultArray[k] = currentElement;
            } else if (firstArray[i] < secondArray[j]) {
                int currentElement = firstArray[i];
                resultArray[k] = currentElement;
            } else {
                int currentElement = secondArray[j];
                resultArray[k] = currentElement;
            }
        }
        return sortBubble(resultArray);
    }
}