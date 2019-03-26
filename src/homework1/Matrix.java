package homework1;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 5, 1, 7},
                {8, 3, 6, 2},
                {6, 7, 2, 5},
                {9, 1, 5, 4}
        };
        matrix(matrix); // выводит матрицу
        diagonal(matrix); // выводит диагональ матрицы
        max(matrix);    // выводит макимальное значение матрицы
        min(matrix);    // выводит минимальное значение матрицы
    }

    public static void matrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println(" ");
        }
    }

    public static void diagonal(int[][] matrix) {
        System.out.print("Диагональ матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j == i; j++)
                System.out.print(matrix[i][j] + " ");
        }
        System.out.println(" ");
    }

    public static void max(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j])
                    max = matrix[i][j];
            }
        }
        System.out.println("Максимальное значение матрицы: " + max);
    }

    public static void min(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j])
                    min = matrix[i][j];
            }
        }
        System.out.println("Минимальное значение матрицы: " + min);
    }

}