public class Gorilla extends Mammal {
    public void throwSomething(){
        System.out.println("Gorilla has thrown something!");
        displayEnergy(-5);
    }
    public void eatBananas(){
        System.out.println("Gorilla loves bananas!");
        displayEnergy(+10);
    }
    public void climb(){
        System.out.println("Gorilla has climbed a tree!");
        displayEnergy(-10);
    }

}