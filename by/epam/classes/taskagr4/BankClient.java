package by.epam.classes.taskagr4;

import java.util.Arrays;

public class BankClient {

    private int id;
    private String name;
    private BankAccount [] bankAccounts = new BankAccount[0];

    public BankClient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBankAccount(BankAccount bankAccount){
        boolean bool = true;
        for (BankAccount bankAccountNew:bankAccounts) {
            if(bankAccountNew.getBankAccountID()==bankAccount.getBankAccountID()){
                bool = false;
            }
        }
        if(bool) {
            this.bankAccounts = Arrays.copyOf(this.bankAccounts, this.bankAccounts.length + 1);
            bankAccounts[bankAccounts.length - 1] = bankAccount;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public BankAccount getBankAccount(int i){
        return bankAccounts[i];
    }
    public void setBankAccount(BankAccount bankAccount, int i){

       this.bankAccounts[i] = bankAccount;

    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bankAccounts=" + Arrays.toString(bankAccounts) +
                '}';
    }
}

