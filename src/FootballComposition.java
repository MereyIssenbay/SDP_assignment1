public class FootballComposition {
    private ScoreGoalSt scoringSt;
    public FootballComposition(ScoreGoalSt scoringSt){
        this.scoringSt = scoringSt;
    }
    public void game(){
        scoringSt.scoreGoal();
    }
}
