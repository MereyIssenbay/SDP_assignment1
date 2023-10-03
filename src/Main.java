import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        FootballComposition penalty = new FootballComposition(new Penalty());
        FootballComposition freeKick = new FootballComposition(new FreeKick());
        FootballComposition openPlay = new FootballComposition(new OpenPlay());
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Here is a chance again!\n" +
                    "1.Score open play goal.\n" +
                    "2.Score penalty.\n" +
                    "3.Score free kick.");
            int st = sc.nextInt();
            switch (st){
                case 1:
                    openPlay.game();
                    break;
                case 2:
                    penalty.game();
                    break;
                case 3:
                    freeKick.game();
                    break;
                default:
                    System.out.println("You are bad football player.");
            }
        }
    }
}