public class Device {

    private int batteryValue;

    public Device(int batteryValue) {
        this.batteryValue = batteryValue;
    }
    public void displayLife(){
        System.out.println("the device has "+batteryValue+" life battery"); 
    }
}