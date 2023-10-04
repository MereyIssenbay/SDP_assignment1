public class Penalty implements ScoreGoalSt{
    @Override
    public void scoreGoal() {
        System.out.println("What a kick. Nice penalty!");
        GoalCounter.getInstance().increase();
        System.out.println("Total goals scored: " + GoalCounter.getInstance().getGoals());
    }

}
