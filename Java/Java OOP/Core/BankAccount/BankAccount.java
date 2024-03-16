public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    public int CheckingBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
    }

       // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public static int getAccounts(){
        return accounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
     // METHODS
    // deposit
    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } 
        else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }
    // withdraw 
    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount; 
            } else {
                System.out.println("Insufficient balance in checking account");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount; //
            } else {
                System.out.println("Insufficient balance in savings account");
            }
        }
    }    
    // getBalance
    public void getBalance() {
        System.out.println("Checking Balance: " + checkingBalance + " $");
        System.out.println("Savings Balance: " + savingsBalance + " $");
    } 
}
