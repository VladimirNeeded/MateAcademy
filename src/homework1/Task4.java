package homework1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fac(5));
        System.out.println(taylor(5, 2));
    }

    public static int fib (int a){
        return (a == 0)? 0: (a == 1) ? 1 : fib(a - 1) + fib(a - 2);
    }
    public static int fac (int a){
        if (a == 0||a == 1)
            return 1;
        int res = fac(a-1) * a;
        return res;
    }
    public static double taylor(int a, int x) {
        if (a==0)
            return 0;

        double result = ((Math.pow(-1, a))/fac(a*2)) * Math.pow(x, 2*a) + taylor(a-1,x);
        return result;
    }
}