package homework1;

public class Power {
    public static void main(String[] args) {
        power(2, 3);
    }

    public static void power (int number, int power){
        int result = number;
        for (int i = 1; i < power; i++) {
            result *= number;
        }
        System.out.println(number +" в степени " + power + "равняется " + result);
    }
}
