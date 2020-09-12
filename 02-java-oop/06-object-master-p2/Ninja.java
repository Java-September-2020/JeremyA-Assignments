public class Ninja extends Human {
    int stealth = 10;

    public void steal (Human target) {
        target.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runaway (){
        this.health -= 10;
    }
}