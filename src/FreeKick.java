public class FreeKick implements ScoreGoalSt{
    @Override
    public void scoreGoal() {
        System.out.println("Are you Messi? Awesome free kick goal!!!");
        GoalCounter.getInstance().increase();
        System.out.println("Total goals scored: " + GoalCounter.getInstance().getGoals());
    }
}
