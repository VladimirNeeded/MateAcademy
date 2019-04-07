package Homework6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
//        Integer[] array1 = {5, 1, 8, 3, 7, 9};
//        Integer[] array2 = {6, 5, 3, 7, 9};
        Set<Integer> myHashSet = new HashSet<Integer>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        Set<Integer> myHashSet2 = new HashSet<Integer>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(4);

        symmetricDifference(myHashSet, myHashSet2);
    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Object[] array1 = set1.toArray();
        Object[] array2 = set2.toArray();
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList = merge(symmetricChecked(array1, array2), symmetricChecked(array2, array1));
        Set<Integer> resultSet = new HashSet<Integer>();
        for (int i = 0; i < resultList.size(); i++){
            resultSet.add(resultList.get(i));
        }
        return (Set<T>) resultSet;
    }

    private static ArrayList<Integer> symmetricChecked(Object[] arr1, Object[] arr2){
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            int checkCounter = 0;
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] != arr2[j]){
                    checkCounter++;
                }
                if (checkCounter == arr2.length){
                    resultList.add((Integer) arr1[i]);
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

//    private static void drawArray(Set<Integer> ){
//        for (int i = 0; i < ArrayList.size(); i++){
//            System.out.println(ArrayList.get(i));
//        }
//    }
}