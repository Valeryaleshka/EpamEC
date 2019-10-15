package by.epam.classes1.task5.main;

public class Main {
  public static void main (String [] args){
      Counter counter = new Counter(8);
      Counter counterRandom = new Counter();
      counterRandom.counterRandom();

      View view = new View();

      view.printCount(counter.getCount());

      counter.increaseCount();

      view.printCount(counter.getCount());

      counter.increaseCount(24);

      view.printCount(counter.getCount());

      counter.decreaseCount();

      view.printCount(counter.getCount());

      counter.decreaseCount(18);

      view.printCount(counter.getCount());



  }
}
