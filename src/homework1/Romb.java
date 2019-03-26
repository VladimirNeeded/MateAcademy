package homework1;

import java.util.Scanner;

public class Romb {

    public static void main(String[] args) {drawRomb();}

    public static void draw1(int i, String s) {
        for (int j = 0; j < (i + 1); j++)
                System.out.print(s);
    }
    public static void draw2(int i, String s, int size) {
            for (int j = i; j < (size - 1); j++)
                System.out.print(s);
    }
    public static void drawRomb() {
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