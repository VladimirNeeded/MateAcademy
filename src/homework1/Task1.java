package homework1;
public class Task1 {
    public static void main (String[] args) {
        System.out.println(Match(3,0,3,0));
        System.out.println(Match(1,1,2,2));
        System.out.println(Match(2,3,1,2));
        System.out.println(Match(1,1,1,3));
    }
    public static int Match (int res1, int res2, int guessres1, int guesssres2 ) {
        int bet = (res1==guessres1 && res2==guesssres2)?2:((res1>res2 && guessres1>guesssres2)||(res2>res1 && guesssres2>guessres1)||(res1==res2 && guessres1==guesssres2))?1:0;
        return bet;
    }
}
