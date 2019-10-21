package by.epam.classes1.task8.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

    public boolean isCardInRange(int firstNumber, int secondNumber, Customer customer){
        if(firstNumber>secondNumber){
            int temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }


        if(customer.getLast4CardNumber()>=firstNumber&&customer.getLast4CardNumber()<=secondNumber){
            return true;
        }else {
            return false;
        }
    }

    public CustomerList sortByFirstName(CustomerList customerList){

        boolean bool;
        do{
            bool = true;
            for (int i = 0; i < customerList.getCustomerLength()-1; i++) {
                if(customerList.getCustomerFirstName(i).compareToIgnoreCase(customerList.getCustomerFirstName(i+1))>0){
                    Customer temp = customerList.getCustomerList(i+1);
                    customerList.setCustomerList(customerList.getCustomerList(i),i+1);
                    customerList.setCustomerList(temp,i);

                    bool = false;
                }
            }
        }while (!bool);
        return customerList;
    }

    public CustomerList customerList (CustomerList customerList, int first, int second){
        CustomerList customerListNew = new CustomerList();
        Logic logic = new Logic();
        for (int i = 0; i <customerList.getCustomerLength() ; i++) {
            if(logic.isCardInRange(2,5555, customerList.getCustomerList(i))){
                customerListNew.appendCustomer(customerList.getCustomerList(i));
            }

        }
        return customerListNew;
    }
}
