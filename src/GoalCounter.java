public class GoalCounter {
    private int goals;
    private static GoalCounter instance;
    private GoalCounter(){
        goals = 0;
    }
    public static GoalCounter getInstance(){
        if (instance == null){
            instance = new GoalCounter();
        }
        return instance;
    }
    public void increase() {
        goals++;
    }

    public int getGoals() {
        return goals;
    }
}
