package homework1;
public class Match {
    public static void main (String[] args) {

        System.out.println(Match(3,0,3,0));
        System.out.println(Match(1,1,2,2));
        System.out.println(Match(2,3,1,2));
        System.out.println(Match(1,1,1,3));
    }
    public static int Match (int goalsOfFirstTeam, int goalsOfSecondTeam, int hypotheticalGoalsOfFirstTeam, int hypotheticalGoalsOfSecondTeam ) {
        boolean guesScore = (goalsOfFirstTeam == hypotheticalGoalsOfFirstTeam) && (goalsOfFirstTeam == hypotheticalGoalsOfSecondTeam);
        boolean guesResult =((goalsOfFirstTeam > goalsOfSecondTeam)
                && (hypotheticalGoalsOfFirstTeam > hypotheticalGoalsOfSecondTeam)
                ||(goalsOfFirstTeam > goalsOfFirstTeam)
                && (hypotheticalGoalsOfSecondTeam > hypotheticalGoalsOfFirstTeam)
                ||(goalsOfFirstTeam == goalsOfSecondTeam)
                && (hypotheticalGoalsOfFirstTeam == hypotheticalGoalsOfSecondTeam));
        int bet = (guesScore)? 2 : (guesResult) ? 1 : 0;
        return bet;
    }
}