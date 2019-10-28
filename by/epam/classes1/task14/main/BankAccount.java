package by.epam.classes1.task14.main;

public class BankAccount {

    private int bankAccountID;
    private double money;
    private boolean accountStatus = true;

    public BankAccount(int bankAccountID, double money) {
        this.bankAccountID = bankAccountID;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(accountStatus){
            this.money = money;
        }
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getBankAccountID() {
        return bankAccountID;
    }

    public void setBankAccountID(int bankAccountID) {
        this.bankAccountID = bankAccountID;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccountID=" + bankAccountID +
                ", money=" + money +
                ", accountStatus=" + accountStatus +
                '}';
    }
}
