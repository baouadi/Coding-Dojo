public class GiantBat extends Mammal{
    public GiantBat(){
        super(300);
    }
    public void fly(){
        System.out.println("the bat is airborne");
        setEnergyLevel(getEnergyLevel() - 50);
    }
    public void eatHumans(){
        System.out.println("the bat's satisfaction");
        setEnergyLevel(getEnergyLevel() + 25);
    }
    public void attackTown(){
        System.out.println("the bat's attack");
        setEnergyLevel(getEnergyLevel() - 100);
    }

}
