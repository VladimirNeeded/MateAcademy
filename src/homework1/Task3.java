package homework1;

public class Task3 {
    public static void main(String[] args) {
    System.out.println(Power(2,1));
    }
    public static int Power (int num, int pow){
        int x = num;
        for (int i=1; i<pow; i++)
            num=num*x;
        return num;
    }
}
