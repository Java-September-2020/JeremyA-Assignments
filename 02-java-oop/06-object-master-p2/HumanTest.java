public class HumanTest {
    public static void main (String[] args) {
        Human homoSapien = new Human();
		System.out.println("Homosapien's Health: " + homoSapien.health);
		
		Ninja haruki = new Ninja();
		System.out.println("Haruki's Health: " + haruki.health);
		
		Wizard azaki = new Wizard();
		System.out.println("Azaki's Health: " + azaki.health);
		
		Samurai atoshi = new Samurai();
		System.out.println("Atoshi's Health: " + atoshi.health);
		
        azaki.fireball(haruki);
        System.out.println("Azaki threw fireball at Haruki by accident!");
        System.out.println("Haruki's Health decreases: " + haruki.health);
        
        azaki.heal(haruki);
        System.out.println("Azaki redeems his mistake and heals Haruki.");
        System.out.println("Haruki's Health increases: " + haruki.health);

        haruki.steal(azaki);
        System.out.println("Haruki refuses to forgive Azaki and steals from him!");
        System.out.println("Azaki's Health decreases: " + azaki.health);
        System.out.println("Haruki's Health increases: " + haruki.health);

        // haruki.runaway();
        // System.out.println("Haruki runs away scared of the repercussions.");
        // System.out.println("Haruki's Health decreases: " + haruki.health);

        // atoshi.deathBlow(haruki);
        // System.out.println("Atoshi destroys Haruki for his incompetence.");
        // System.out.println("Haruki's Health: " + haruki.health);
        // System.out.println("Atoshi's Health is cut in half: " + atoshi.health);

        // atoshi.meditate();
        // System.out.println("Atoshi meditates to heal himself...");
        // System.out.println("Atoshi's Health increases: " + atoshi.health);

        // System.out.println(atoshi.howMany() + " copies of Atoshi exist by the way.");


    }
}