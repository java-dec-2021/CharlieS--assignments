public class BankAccount {
    public static int accountsCreated = 0;
    public static double totalBalance = 0;
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount(){
        BankAccount.accountsCreated += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void depositMoney(double amount, String account){
        if(account.equals("savings"))
            this.savingsBalance += amount;
        else if(account.equals("checking"))
            this.checkingBalance += amount;
        BankAccount.totalBalance += amount;
    }

    public void withdrawMoney(double amount, String account){
        boolean successful = false;
        if(account.equals("savings")){
            if(this.savingsBalance - amount >= 0){
                successful = true;
                this.savingsBalance -= amount;
            }
        }
        else if(account.equals("checking")){
            if(this.checkingBalance - amount >= 0){
                successful = true;
                this.checkingBalance -= amount;
            }
        }
        if(successful){
            BankAccount.totalBalance -= amount;
        }
    }

    public void showBalance(){
        System.out.println(String.format("Savings:, Checking: ", this.savingsBalance, this.checkingBalance));
    }
    
}
