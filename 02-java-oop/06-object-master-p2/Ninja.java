public class Ninja {
    int health = 100;
    int stealth = 10;

    public void steal (Human target) {
        target.health -= this.stealth;
        this.stealth += this.health;
    }

    public void runaway (){
        this.health -= 10;
    }
}