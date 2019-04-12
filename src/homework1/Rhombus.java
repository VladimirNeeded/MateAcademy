package homework1;

import java.util.Scanner;

public class Rhombus  {

    public static void main(String[] args) {

        drawRhombus ();
    }

    public static void draw1(int indents, String drawnElement) {
        for (int alow = 0; alow < (indents + 1); alow++)
                System.out.print(drawnElement);
    }
    public static void draw2(int indents, String drawnElement, int size) {
            for (int alow = indents; alow < (size - 1); alow++)
                System.out.print(drawnElement);
    }
    public static void drawRhombus () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите размер ромба: ");
        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            draw2(i," ", size);
            draw1(i, "* ");
            System.out.println(" ");
        }
        for (int i = 0; i < size; i++) {
            draw1(i, " ");
            draw2(i,"* ", size);
            System.out.println(" ");
        }
    }
}