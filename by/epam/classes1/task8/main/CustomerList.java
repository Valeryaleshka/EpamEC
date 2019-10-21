package by.epam.classes1.task8.main;

import java.util.Arrays;

public class CustomerList {
    private Customer [] customerList;

    public CustomerList(Customer[] customers) {
        this.customerList = customers;
    }

    public CustomerList(){
        this.customerList = new Customer[0];

    }

    public CustomerList(int i){
        this.customerList = new Customer[i];
    }

    public void appendCustomer(Customer customer){

            customerList = Arrays.copyOf(customerList, customerList.length + 1);
            customerList[customerList.length - 1] = customer;

    }

    public void setCustomerList(Customer[] customerList) {
        this.customerList = customerList;
    }

    public Customer[] getCustomerList() {
        return customerList;
    }

    public Customer getCustomerList(int i) {
        return customerList[i];
    }

    public String getCustomerFirstName (int i){
        return customerList[i].getFirstName();
    }
    public void setCustomerList (Customer customer,int i){
        this.customerList[i]=customer;
    }
    public int getCustomerLength(){
        return customerList.length;
    }

    public String toString (int i){
        return customerList[i].toString();
    }
}
