package by.epam.classes1.task1;

public class Main {
    public static void main (String [] args){
        Test1 number = new Test1(7,5);
        Logic logic = new Logic();

        System.out.println(logic.getSum(number));
        System.out.println(logic.getBiggerNumber(number));
    }
}
