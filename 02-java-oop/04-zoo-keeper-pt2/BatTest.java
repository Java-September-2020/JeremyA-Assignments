public class BatTest {
    public static void main (String[] args) {
        Bat batman = new Bat();

        batman.displayEnergy();
        batman.attackTown();
        batman.attackTown();
        batman.attackTown();
        batman.displayEnergy();

        batman.eatHumans();
        batman.eatHumans();
        batman.displayEnergy();

        batman.fly();
        batman.fly();
        batman.displayEnergy();
    }
}