package by.epam.classes1.Task15.main;

public class Main {
    public static void main (String [] args){

        Base base = new Base();

        base.addFood(new Food("Все включено"));
        base.addFood(new Food("Только завтраки"));
        base.addFood(new Food("Без питания"));

        base.addTransport(new Transport("Автобус"));
        base.addTransport(new Transport("Самолет"));
        base.addTransport(new Transport("Поезд"));
        base.addTransport(new Transport("Автомобиль"));
        base.addTransport(new Transport("Яхта"));

        base.addDuration(new Duration(14));
        base.addDuration(new Duration(7));
        base.addDuration(new Duration(10));

        base.addTravelPackage(new TravelPackage("Отдых", "Прага",base.getDurations(1),base.getFoods(1),base.getTransports(1)));
        base.addTravelPackage(new TravelPackage("Лечение", "Гагры",base.getDurations(2),base.getFoods(2),base.getTransports(2)));
        base.addTravelPackage(new TravelPackage("Экскурсии", "Сочи",base.getDurations(3),base.getFoods(3),base.getTransports(3)));
        base.addTravelPackage(new TravelPackage("Шопинг", "Париж",base.getDurations(1),base.getFoods(2),base.getTransports(4)));
        base.addTravelPackage(new TravelPackage("Круиз", "Тихий океан",base.getDurations(2),base.getFoods(1),base.getTransports(5)));




    }
}
