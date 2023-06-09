package timbuchalka;

public class Account2 {

    private String phoneNumber;
    private String email;
    private String customerName;
    private double accountBalance;
    private String accountNumber;

    public Account2(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setBalanceToAccountBalance(String accountNumber){
        double balance = 0;
        if (accountNumber.equals(this.accountNumber)) balance = accountBalance;
    }

    public double checkAccountBalance(String accountNumber) {
        double balance = 0;
        setBalanceToAccountBalance(accountNumber);
        return balance;
    }
}
