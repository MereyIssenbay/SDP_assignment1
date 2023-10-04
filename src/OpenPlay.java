public class OpenPlay implements ScoreGoalSt{
    @Override
    public void scoreGoal() {
        System.out.println("You scored a open play goal!");
        GoalCounter.getInstance().increase();
        System.out.println("Total goals scored: " + GoalCounter.getInstance().getGoals());
    }
}
