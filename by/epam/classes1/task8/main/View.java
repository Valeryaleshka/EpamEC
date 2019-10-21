package by.epam.classes1.task8.main;

public class View {
    public void printInvalidCardNumber(){
        System.out.println("Номер карты неправильно введен");
    }

    public void printCustomers(Customer [] customers){
        for (int i = 0; i<customers.length; i++) {
            System.out.println(customers[i].toString());
        }
    }
    public void printCustomers(CustomerList customers){
        for (int i = 0; i<customers.getCustomerLength(); i++) {
            System.out.println(customers.toString(i));
        }
    }

}
