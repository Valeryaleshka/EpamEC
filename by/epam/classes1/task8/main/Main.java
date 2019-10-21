package by.epam.classes1.task8.main;

public class Main {
    public static void main (String []args){
        CustomerList customerList = new CustomerList();
        Customer [] customers = new Customer[10];
        View view = new View();
        Logic logic = new Logic();
        customerList.appendCustomer(customers[0] = new Customer(58,"Василевский","Василий","Васильевич","Минск",2354,5132));
        customerList.appendCustomer(customers[1] = new Customer(57,"Кукушкин","Василий","Васильевич","Минск",125,5132));
        customerList.appendCustomer(customers[2] = new Customer(28,"Самарин","Василий","Васильевич","Минск",5538,5132));
        customerList.appendCustomer(customers[3] = new Customer(89,"Шышко","Василий","Васильевич","Минск",5125,5132));
        customerList.appendCustomer(customers[4] = new Customer(7,"Каравка","Василий","Васильевич","Минск",2354,5132));
        customerList.appendCustomer(customers[5] = new Customer(87,"Аленков","Василий","Васильевич","Минск",4526,5132));
        customerList.appendCustomer(customers[6] = new Customer(66,"Ладников","Василий","Васильевич","Минск",4567,5132));
        customerList.appendCustomer(customers[7] = new Customer(3,"Янковский","Василий","Васильевич","Минск",7561,5132));
        customerList.appendCustomer(customers[8] = new Customer(36,"Боярский","Василий","Васильевич","Минск",4556,5132));
        customerList.appendCustomer(customers[9] = new Customer(17,"Сименсис","Василий","Васильевич","Минск",1235,5132));

        view.printCustomers(logic.sortByFirstName(customerList));
        System.out.println();
        view.printCustomers(customerList);
        System.out.println();
        view.printCustomers(logic.customerList(customerList,12,5555));
    }
}
