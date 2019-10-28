package by.epam.classes1.task14.main;

public class BankAccountLogic {

    private BankAccount bankAccount;

    public BankAccountLogic(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void putMoneyIntoTheAccount(double money){
        if(bankAccount.isAccountStatus()){
            bankAccount.setMoney(bankAccount.getMoney()+money);
        }
    }

    public void withdrawMoneyFromTheAccount(double money){
        if(bankAccount.isAccountStatus()){
            bankAccount.setMoney(bankAccount.getMoney()-money);
        }
    }

    public void blockAccount (){
        bankAccount.setAccountStatus(false);
    }

    public void unblockAccount (){
        bankAccount.setAccountStatus(true);
    }
}
