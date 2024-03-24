public class Phone extends Device {

    private int batteryValue;
    public Phone(int batteryValue) {
        super(batteryValue);
        this.batteryValue=batteryValue;
    }
    
    public void makeCall(){
        System.out.println("You Make a call");
        batteryValue -= 5;
        System.out.println("Battery remaining : "+ batteryValue);
    }
    public void playGame(){
        System.out.println("You Play a Game");
        batteryValue -= 20;
        System.out.println("Battery remaining : "+batteryValue);
    }
    public void charge(){
        System.out.println("You Charge the Phone");
        batteryValue += 50;
        System.out.println("Battery remaining : "+batteryValue);

    }
}
