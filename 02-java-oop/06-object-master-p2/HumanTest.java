public class HumanTest {
    public static void main (String[] args) {
        Human homoSapien = new Human();
		System.out.println("Homosapien's Health:" + homoSapien.health);
		
		Ninja haruki = new Ninja();
		System.out.println("Haruki's Health:" + haruki.health);
		
		Wizard azaki = new Wizard();
		System.out.println("Azaki's Health:" + azaki.health);
		
		Samurai atoshi = new Samurai();
		System.out.println("Atoshi's Health:" + atoshi.health);
		
        azaki.attack(haruki);
        System.out.println("Haruki attacked by Azaki!");
		System.out.println("Haruki's Health:" + haruki.health);
    }
}