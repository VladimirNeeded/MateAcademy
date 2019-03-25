package homework2;

public class SortUtils {

    public static void main (String[] args){

        drawArray(sortBubble(createArray(10)));

        }

    public static int[] createArray (int n) {
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) (Math.random()*100);
        return arr;
    }
    public static void drawArray (int[] arr){
        for (int i=0; i < arr.length; i++ )
            System.out.print(arr[i]+" ");
    }
    public static int[] sortBubble(int[] arr) {
        for (int i=arr.length-1;i>=1;i--) {
            for (int j=0;j<i;j++) {
                if (arr[j]>arr[j+1]) {
                   int box = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=box;
                }
            }
        }
        return arr;
    }
//    public static int[] sortMerge(int[] arr){                // не получилось :(
//        int n = arr.length;
//        int m = n/2;
//
//    }
}

