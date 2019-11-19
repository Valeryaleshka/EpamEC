/*Создать класс Payment с внутренним классом, с помощью объектов которого можно
сформировать покупку из нескольких товаров.
*/
  package by.epam.oop.task2;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.addToCart(new Payment.ObjectClass("Кровать",202.5));
        payment.addToCart(new Payment.ObjectClass("Диван",55.1));
        payment.addToCart(new Payment.ObjectClass("Шкаф",288.2));
        payment.addToCart(new Payment.ObjectClass("Тумба",100));

        View view = new View();
        view.printPayment(payment);
    }
}
