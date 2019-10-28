package by.epam.classes.task8;

public class View {

    public void printCustomers(Customer [] customers){
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void printCustomers(CustomerList customers){
        for (int i = 0; i<customers.getCustomerLength(); i++) {
            System.out.println(customers.toString(i));
        }
    }
}
