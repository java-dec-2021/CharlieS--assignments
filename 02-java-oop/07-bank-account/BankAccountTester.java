public class BankAccountTester {
   
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.depositMoney(1200, "savings");
        account.depositMoney(50, "checking");
        account.showBalance();
        System.out.println(BankAccount.totalBalance);

        account.withdrawMoney(100, "savings");
        account.withdrawMoney(60, "checking");
        account.showBalance();
        System.out.println(BankAccount.totalBalance);
    }
}
