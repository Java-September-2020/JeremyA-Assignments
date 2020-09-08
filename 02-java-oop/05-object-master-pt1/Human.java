public class Human {
    int health;
    int strength;
    int stealth;
    int intelligence;

    public Human () {
        health = 100;
        strength = 3;
        stealth = 3;
        intelligence = 3;
    }
    public int attack() {
        System.out.println("Human attacked!");
        health = health - strength;
        return health;
    }

}