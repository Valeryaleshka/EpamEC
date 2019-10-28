/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
        на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
        произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
        позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

package by.epam.classes.task5;

public class Main {
  public static void main (String [] args){

      DecimalCounter decimalCounter = new DecimalCounter(8);
      DecimalCounter decimalCounterRandom = new DecimalCounter();
      decimalCounterRandom.counterRandom();

      View view = new View();

      view.printCount(decimalCounter.getCount());

      decimalCounter.increaseCount();

      view.printCount(decimalCounter.getCount());

      decimalCounter.increaseCount(24);

      view.printCount(decimalCounter.getCount());

      decimalCounter.decreaseCount();

      view.printCount(decimalCounter.getCount());

      decimalCounter.decreaseCount(18);

      view.printCount(decimalCounter.getCount());



  }
}
