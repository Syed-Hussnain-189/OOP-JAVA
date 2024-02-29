public class BankAccount {

    long accountNumber;
    private String accountTitle;
    private double balance;

    public void setAccountNumber(long acctNo) {
        accountNumber = acctNo;
    }
    public void setAccountTitle(String acctTitle) {
        accountTitle = acctTitle;
    }
    public void setBalance(double b) {
        if(b>0){
            balance = b;
        } else{
            System.out.println("Invalid balance");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public String getAccountTitle() {
        return accountTitle;
    }
    public double getBalance() {
        return balance;
    }
}