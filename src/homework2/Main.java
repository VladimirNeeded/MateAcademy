package homework2;

public class Main extends SortUtils {

    public static void main (String[] args){

        int[] array = createArray(10);
        System.out.println("Массив до сортировки: ");
        drawArray(array);
        System.out.println("Массив после Sort Bubble: ");
        drawArray(sortBubble(array));

        int[]array1 = createArray(10);
        int[]array2 = createArray(10);
        int[]array3 = new int[array1.length+array2.length];
        drawArray(array1);
        drawArray(array2);



        Processor processor1 = new Processor("Intel", "i7", 7, 3.2, 300);

    }
}
