public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    static class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
        }
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("123456", "Alice", 5000.00);
        SavingsAccount sa1 = new SavingsAccount("654321", "Bob", 10000.00);

        System.out.println("Balance: " + ba1.getBalance());
        ba1.setBalance(5500.00);
        System.out.println("Updated Balance: " + ba1.getBalance());

        sa1.displayAccountInfo();
    }
}
