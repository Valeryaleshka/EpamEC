package by.epam.classes1.task14.main;

public class BankClientLogic {

    BankClient bankClient;

    public BankClientLogic(BankClient bankClient) {
        this.bankClient = bankClient;
    }

    public void sortAccountsByID (){
        BankAccount bankAccountTemp;
        boolean bool;
        do {

            bool = true;

            for (int i = 0; i < bankClient.getBankAccounts().length-1; i++) {

                if(bankClient.getBankAccount(i).getBankAccountID()>bankClient.getBankAccount(i+1).getBankAccountID()){

                    bankAccountTemp=bankClient.getBankAccount(i);
                    bankClient.setBankAccount(bankClient.getBankAccount(i+1),i);
                    bankClient.setBankAccount(bankAccountTemp,i+1);
                    bool = false;
                }
            }

        }while (!bool);
    }




    public void sortAccountsByMoney (){
        BankAccount bankAccountTemp;
        boolean bool;
        do {

            bool = true;

            for (int i = 0; i < bankClient.getBankAccounts().length-1; i++) {

                if(bankClient.getBankAccount(i).getMoney()>bankClient.getBankAccount(i+1).getMoney()){

                    bankAccountTemp=bankClient.getBankAccount(i);
                    bankClient.setBankAccount(bankClient.getBankAccount(i+1),i);
                    bankClient.setBankAccount(bankAccountTemp,i+1);
                    bool = false;
                }
            }

        }while (!bool);
    }


    public BankAccount findBankAccountByID(int bankAccountID){
        for (BankAccount bankakka:bankClient.getBankAccounts()) {
            if(bankakka.getBankAccountID()==bankAccountID){
                return bankakka;
            }
        }
        return null;
    }

    public double getClientSummOfMoney(){
        double summ = 0;
        for (BankAccount bankakk:bankClient.getBankAccounts()) {
            summ+=bankakk.getMoney();
        }
        return summ;
    }

    public double getClientSummOfMoneyOnlyPositiveBalance(){
        double summ = 0;
        for (BankAccount bankakk:bankClient.getBankAccounts()) {
            if(bankakk.getMoney()>0){
            summ+=bankakk.getMoney();}
        }
        return summ;
    }

    public double getClientSummOfMoneyOnlyNegativeBalance(){
        double summ = 0;
        for (BankAccount bankakk:bankClient.getBankAccounts()) {
            if(bankakk.getMoney()<0){
                summ+=bankakk.getMoney();}
        }
        return summ;
    }
}
