package homework1;

public class Power {
    public static void main(String[] args) {
    System.out.println (power (2, 3));
    }
    public static int power (int num, int pow){
        int result = num;
        for (int i = 1; i < pow; i++)
            result *= num;
        return result;
    }
}
