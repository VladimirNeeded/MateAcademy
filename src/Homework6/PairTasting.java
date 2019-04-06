package Homework6;

public class PairTasting {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(1, "Lobov");
        Pair<Integer, String> pair2 = new Pair<>(1, "Lobov");
        Pair<Integer, String> pair3 = new Pair<>(2, "Lobov");
        System.out.println(pair1.hashCode());
        System.out.println(pair2.hashCode());
        System.out.println(pair3.hashCode());
        System.out.println(pair1.equals(pair2));
        System.out.println(pair1.equals(pair3));
        System.out.println(pair3.getSecondValue());
        System.out.println(pair1.getFirstValue());
    }
}
