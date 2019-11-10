package by.epam.oop.task2;

public class View {

    public void printPayment(Payment payment){

        System.out.println("Ваша корзина:");
        for (int i = 0; i<payment.getObjects().length ; i++) {
            System.out.println("<"+payment.getObject(i).getObjectName()+"> - цена "+payment.getObject(i).getPrice());
        }
        System.out.println("Итоговая цена = "+payment.getTotalPrice());
    }
}
