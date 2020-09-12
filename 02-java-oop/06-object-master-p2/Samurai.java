public class Samurai extends Human {
    int samurais = 4;

    public Samurai (){
    health = 200;
    }

    public void deathBlow (Human target) {
        target.health -= target.health;
        this.health = this.health / 2;
    }

    public void meditate () {
        this.health += this.health/2;
    }

    public int howMany() {
        return this.samurais;
    }
}