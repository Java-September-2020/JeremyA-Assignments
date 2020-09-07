public class Bat {
    int energyLevel;

    public Bat() {
        energyLevel = 300;
    }

    public int displayEnergy() {
        System.out.println(energyLevel);
        return energyLevel;
    }

    public int fly() {
        System.out.println("Swoosh Swoosh");
        energyLevel -= 50;
        return energyLevel;
    }

    public int eatHumans() {
        System.out.println("Crunch Crunch");
        energyLevel += 25;
        return energyLevel;
    }

    public int attackTown() {
        System.out.println("Burn Burn");
        energyLevel -= 100;
        return energyLevel;
    }
}