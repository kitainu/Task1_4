public class FootBallPlayer {
    private String name;
    private int age;
    private String positionOnTheField;
    private String currentTeam;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public  void setPositionOnTheField(String positionOnTheField) {
        this.positionOnTheField = positionOnTheField;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public void methodRun() {
        System.out.println("Lubię sobie pobiegać");
    }

    public void methodPassBall() {
        System.out.println("Dałeś ciałą");
    }

    public void methodShoot() {
        System.out.println("im więcej tym lepiej");
    }

    public void methodFakeInjury() {
        System.out.println("Ałłłaaaaaa!!!!!!11");
    }

    public FootBallPlayer(String name, int age, String positionOnTheField, String currentTeam) {
        this.name = name;
        this.age = age;
        this.positionOnTheField = positionOnTheField;
        this.currentTeam = currentTeam;
    }
}
