package homework1;

public class Power {
    public static void main(String[] args) {
    System.out.println (power (2, 3));
    }
    public static int power (int number, int power){
        int result = number;
        for (int i = 1; i < power; i++)
            result *= number;
        return result;
    }
}
