/*Создать класс Payment с внутренним классом, с помощью объектов которого можно
сформировать покупку из нескольких товаров.
*/
  package by.epam.oop.task2;

public class Main {
    public static void main(String[] args) {

        Payment.ObjectClass objectClass0 = new Payment.ObjectClass("Кровать",202.5);
        Payment.ObjectClass objectClass1 = new Payment.ObjectClass("Диван",55.1);
        Payment.ObjectClass objectClass2 = new Payment.ObjectClass("Шкаф",288.2);
        Payment.ObjectClass objectClass3 = new Payment.ObjectClass("Тумба",100);

        Payment payment = new Payment();
        payment.addToCart(objectClass0);
        payment.addToCart(objectClass1);
        payment.addToCart(objectClass2);
        payment.addToCart(objectClass3);

        View view = new View();
        view.printPayment(payment);
    }
}
