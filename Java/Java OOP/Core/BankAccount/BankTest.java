public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount bank1 = new BankAccount(100, 0);
        BankAccount bank2 = new BankAccount(0, 199.90);
        BankAccount bank3 = new BankAccount(200.22, 340);
        // Deposit Test
        bank1.deposit(250, "checking");
        bank2.deposit(199.90, "saving");
        bank3.deposit(0, "saving");
        
        System.out.println("******Cheking Accounts Balances******");
        System.out.println("Bank Account 1 Checking Balance: " + bank1.getCheckingBalance() + " $");
        System.out.println("Bank Account 2 Cheking Savings Balance: " + bank2.getSavingsBalance()+ " $");
        System.out.println("Bank Account 3 Checking Balance: " + bank3.getCheckingBalance()+ "$");
        System.out.println("Total Money: " + BankAccount.getTotalMoney()+ " $");
        // Withdrawal Test
        System.out.println("******Cheking Balances after Withdrawal******");
        bank1.withdraw(1500, "checking");
        bank2.withdraw(78899.9, "saving");
        bank3.withdraw(300, "saving");
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        System.out.println("Account 1 Checking Balance: $" + bank1.getCheckingBalance());
        System.out.println("Account 2 Savings Balance: $" + bank2.getSavingsBalance());
        System.out.println("Account 3 Checking Balance: $" + bank3.getCheckingBalance());
        System.out.println("Total Money: $" + BankAccount.getTotalMoney());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("\nStatic Test:");
        System.out.println("Number of Bank Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money: $" + BankAccount.getTotalMoney());
        
    }
}
