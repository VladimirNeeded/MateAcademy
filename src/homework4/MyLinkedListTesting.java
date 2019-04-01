package homework4;

public class MyLinkedListTesting {
    public static void main(String[] args) {
        MyLinkedList<String> myLL = new MyLinkedList<>();
        myLL.add("One");
        myLL.add("Two",1);
        myLL.add("Three");
        myLL.add("Four");
        MyLinkedList<String> myLL2 = new MyLinkedList<>();
        myLL2.add("Five");
        myLL.addAll(myLL2);
        System.out.println(myLL.get(0));
        System.out.println(myLL.size());

        myLL.remove("Two");
        System.out.println(myLL.get(1));

        MyLinkedList<Integer> myLL3 = new MyLinkedList<>();
        System.out.println(myLL3.isEmpty());

    }

}
