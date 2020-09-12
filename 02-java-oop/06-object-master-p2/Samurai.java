public class Samurai extends Human {
    int health = 200;
    int samurai = 4;

    public void deathBlow (Human target) {
        target.health -= target.health;
        this.health = this.health / 2;
    }

    public void meditate () {
        this.health += this.health/2;
    }

    public int howMany() {
        return this.samurai;
    }
}