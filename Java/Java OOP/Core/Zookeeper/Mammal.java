public class Mammal {

    private int energyLevel;

    public int getEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public void displayEnergy(){
        System.out.println("The energy level is "+energyLevel);
    }
}