package homework1;

public class Recursion  {
    public static void main(String[] args) {

        System.out.println(fibonacci(6));
        System.out.println(fuctorial(5));
        System.out.println(taylor(5, 2));
    }

    public static int fibonacci (int a){
        if (a == 0)
            return 0;
        if (a == 1)
            return 1;
        else return fibonacci(a - 1) + fibonacci(a - 2);
    }
    public static int fuctorial (int a){
        if ((a == 0) || (a == 1))
            return 1;
        int result = fuctorial(a - 1) * a;
        return result;
    }
    public static double taylor(int a, int x) {
        if (a == 0)
            return 0;
        double result = ((Math.pow(-1, a))/fuctorial(a * 2)) * Math.pow(x, 2 * a) + taylor(a - 1, x);
        return result;
    }
}