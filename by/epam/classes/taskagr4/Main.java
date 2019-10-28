package by.epam.classes.taskagr4;

public class Main {
    public static void main(String[] args){

        BankAccount bankAccount1 = new BankAccount(2,5598);
        BankAccount bankAccount2 = new BankAccount(56,17);
        BankAccount bankAccount3 = new BankAccount(14,288);
        BankAccount bankAccount4 = new BankAccount(22,-340.5);
        BankAccount bankAccount5 = new BankAccount(26,552);
        BankAccount bankAccount6 = new BankAccount(3,-225);

        BankClient artem = new BankClient(1,"Артем");

        artem.addBankAccount(bankAccount1);
        artem.addBankAccount(bankAccount2);
        artem.addBankAccount(bankAccount3);
        artem.addBankAccount(bankAccount4);
        artem.addBankAccount(bankAccount5);
        artem.addBankAccount(bankAccount6);


        System.out.println(artem.toString());
        BankClientLogic bankClientLogic = new BankClientLogic(artem);
        bankClientLogic.sortAccountsByID();
        System.out.println(artem.toString());
        bankClientLogic.sortAccountsByMoney();
        System.out.println(artem.toString());
        System.out.println(bankClientLogic.findBankAccountByID(3));
        System.out.println(bankClientLogic.getClientSummOfMoney());
        System.out.println(bankClientLogic.getClientSummOfMoneyOnlyPositiveBalance());
        System.out.println(bankClientLogic.getClientSummOfMoneyOnlyNegativeBalance());

    }
}
