package homework4;

import java.util.ArrayList;

public class MyArrayListTesting {
    public static void main(String[] args) {
        List<String> myAL = new MyArrayList<>();
        myAL.add("One");
        myAL.add("Two", 1);
        List<String> myAL2 = new MyArrayList<>();
        myAL2.add("Three");
        myAL2.add("Four");
        myAL.addAll(myAL2);
        for (int i = 0; i < myAL.size(); i++){
            System.out.println(myAL.get(i));
        }
        System.out.println(myAL.get(2));
        System.out.println(myAL2.get(1));
        myAL2.set("Trio",0);
        for (int i = 0; i < myAL2.size(); i++){
            System.out.println(myAL2.get(i));
        }
        myAL2.remove(0);
        myAL2.remove("Four");
        System.out.println(myAL2.size());
        System.out.println(myAL2.isEmpty());
    }
}