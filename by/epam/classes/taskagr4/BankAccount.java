/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
        счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
        всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

package by.epam.classes.taskagr4;

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
