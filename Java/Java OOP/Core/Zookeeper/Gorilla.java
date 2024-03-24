public class Gorilla extends Mammal{
    public Gorilla() {
        super(100);
    }
    public void throwSomething(){
        System.out.println("the gorilla has thrown something");
        setEnergyLevel(getEnergyLevel() - 5);
    }
    public void eatBananas(){
        System.out.println(" the gorilla's satisfaction");
        setEnergyLevel(getEnergyLevel() + 10);
    }
    public void climb(){
    System.out.println("the gorilla has climbed a tree");
    setEnergyLevel(getEnergyLevel() - 10);
    }
}
