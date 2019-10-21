package by.epam.classes1.task8.main;

public class Customer {
    private int id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String address;
    private int last4CardNumber;
    private int bankAccountNumber;

    public Customer(int id, String firstName, String secondName, String lastName, String address, int cardNumber, int bankAccountNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.address = address;
        this.last4CardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(){
        this.id = 0;
        this.firstName = "firstName";
        this.secondName = "secondName";
        this.lastName = "lastName";
        this.address = "address";
        this.last4CardNumber = 4245;
        this.bankAccountNumber = 111111;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLast4CardNumber(int last4CardNumber) {
        this.last4CardNumber = last4CardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getLast4CardNumber() {
        return last4CardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber='" + last4CardNumber + '\'' +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}

