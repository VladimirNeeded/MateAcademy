package Homework6;

import java.util.ArrayList;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Integer[] array1 = {5, 1, 8, 3, 7, 9};
        Integer[] array2 = {6, 5, 3, 7, 9};
        drawArray(SymmetricDifference.<Object>symmetricDifference(array1, array2));
    }
    public static <T> ArrayList<Integer> symmetricDifference(Integer[] set1, Integer[] set2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList = merge(symmetricChecked(set1, set2), symmetricChecked(set2, set1));
        return (ArrayList<Integer>) resultList;
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