import javax.naming.Name;

public class PlayerInspection {
    public static void main(String[] args) {
        FootBallPlayer footBallPlayer = new FootBallPlayer("Ronaldo",21, "GoalKeeper","FC Barcelona");
        footBallPlayer.getName();
        footBallPlayer.getAge();
        footBallPlayer.methodRun();
        footBallPlayer.methodShoot();
    }
}
