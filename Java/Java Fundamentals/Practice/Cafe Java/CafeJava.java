public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables 
        double mochaPrice = 3.5;
        double cofePrice = 2.5;
        double lattePrice = 4.2;
        double cappuccinoPrice = 3.2;
    
        // Customer name variables 
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions 
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); 
        System.out.println(customer1 + pendingMessage); 
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);     
        }
        double totalSam = lattePrice *2 ;
        System.out.println( customer2 + displayTotalMessage + totalSam);
        if (isReadyOrder2 == false) {
            isReadyOrder2 = true;
            System.out.println( customer2 + readyMessage);    
        }

    }
}
