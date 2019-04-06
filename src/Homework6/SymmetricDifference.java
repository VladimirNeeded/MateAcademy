package Homework6;

import java.util.ArrayList;

public class SymmetricDifference {
    public static void main(String[] args) {
        Integer[] array1 = {5, 1, 8, 3, 7, 9};
        Integer[] array2 = {6, 5, 3, 7, 9};
        drawArray(symmetricDifference(array1, array2));
    }
    private static ArrayList<Integer> symmetricDifference (Integer[] arr1, Integer[] arr2){
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList = merge(symmetricChecked(arr1, arr2), symmetricChecked(arr2, arr1));
        return resultList;
    }

    private static ArrayList<Integer> symmetricChecked(Integer[] arr1, Integer[] arr2){
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            int checkCounter = 0;
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] != arr2[j]){
                    checkCounter++;
                }
                if (checkCounter == arr2.length){
                    resultList.add(arr1[i]);
                }
            }
        }
        return resultList;
    }

    private static ArrayList<Integer> merge (ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++){
            resultList.add(arr1.get(i));
        }
        for (int i = 0, j = arr1.size(); j < arr2.size() + arr1.size(); j++, i++){
            resultList.add(arr2.get(i));
        }
        return resultList;
    }

    private static void drawArray(ArrayList<Integer> ArrayList){
        for (int i = 0; i < ArrayList.size(); i++){
            System.out.println(ArrayList.get(i));
        }
    }
}