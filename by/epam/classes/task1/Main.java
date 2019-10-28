/*1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.*/

package by.epam.classes.task1;

public class Main {
    public static void main (String [] args){

        Test1 test1 = new Test1(7,5);
        Logic logic = new Logic();

        System.out.println(logic.getSum(test1));
        System.out.println(logic.getBiggerNumber(test1));
    }
}
