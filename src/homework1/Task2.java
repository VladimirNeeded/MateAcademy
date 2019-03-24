package homework1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
    DrawStar();
    }

    public static void DrawStar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите размер ромба: ");
        int size = scan.nextInt();

        for (int i = 0; i<size; i++) {
            for (int j = i; j < (size-1); j++) {
                System.out.print(" ");
            }
            for (int z = 0; z<(i+1); z++)
                System.out.print("* ");

            System.out.println(" ");
        }
        for (int i = 0; i<size; i++) {
            for (int j = 0; j<(i+1); j++) {
                System.out.print(" ");
            }
            for (int z = i; z<(size-1); z++)
                System.out.print("* ");

            System.out.println(" ");
        }
    }
}