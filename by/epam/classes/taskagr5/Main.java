/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
        различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
        возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

package by.epam.classes.taskagr5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        View view = new View();
        Base base = new Base();
        Scanner scanner = new Scanner(System.in);

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

        base.addTravelPackage(new TravelPackage("Отдых", "Прага", base.getDurations(1), base.getFoods(1), base.getTransports(1)));
        base.addTravelPackage(new TravelPackage("Лечение", "Гагры", base.getDurations(2), base.getFoods(2), base.getTransports(2)));
        base.addTravelPackage(new TravelPackage("Экскурсии", "Сочи", base.getDurations(3), base.getFoods(3), base.getTransports(3)));
        base.addTravelPackage(new TravelPackage("Шопинг", "Париж", base.getDurations(1), base.getFoods(2), base.getTransports(4)));
        base.addTravelPackage(new TravelPackage("Круиз", "Тихий океан", base.getDurations(2), base.getFoods(1), base.getTransports(5)));
        base.addTravelPackage(new TravelPackage("Круиз", "Тихий океан", base.getDurations(2), base.getFoods(1), base.getTransports(5)));
        base.addTravelPackage(new TravelPackage("Экскурсии", "Сочи", base.getDurations(3), base.getFoods(3), base.getTransports(3)));

        String choice = null;

        boolean bool = false;
        do {
            System.out.println("Выбрать путевку из существующизх(1), собрать свою(2), выход(q)");

            if (scanner.hasNextInt()) {

                int choiceInt = scanner.nextInt();

                if (choiceInt > 0 && choiceInt < 3) {
                    choice = Integer.toString(choiceInt);
                    bool = true;
                }
            } else scanner.next();

        } while (!bool);


        switch (choice) {

            case ("1"):
                int choiceTravelPackage = 0;
                boolean boolchoiceTravelPackage = false;
                do {
                    System.out.println("Выберите путевку");
                    view.printTravelPackages(base);

                    if (scanner.hasNextInt()) {

                        choiceTravelPackage = scanner.nextInt();

                        if (choiceTravelPackage > 0 && choiceTravelPackage <= base.getTravelPackages().length) {
                            choice = Integer.toString(choiceTravelPackage);
                            boolchoiceTravelPackage = true;
                        }
                    } else scanner.next();

                } while (!boolchoiceTravelPackage);

                System.out.println("Ваша путевка - " + base.getTravelPackages(choiceTravelPackage - 1).toString());

                break;

            //////////////////////////////////////////////////////////////////////////

            case ("2"):

                TravelPackage travelPackageNew = new TravelPackage();

                travelPackageNew.setName("Индивидуальная");
                boolean boolNewPackage = false;

                System.out.println("Введите куда вы хотели бы поехать");
                travelPackageNew.setDestination(scanner.next());

                do {
                System.out.println("Выберите продолжительность");
                view.printDurations(base);
                    if (scanner.hasNextInt()) {

                        int choiceTravelDuration = scanner.nextInt();

                        if (choiceTravelDuration > 0 && choiceTravelDuration <= base.getDurations().length) {
                            travelPackageNew.setDuration(base.getDurations(choiceTravelDuration));
                            boolNewPackage = true;
                        }
                    } else scanner.next();

                } while (!boolNewPackage);

                boolNewPackage=false;

                do {
                    System.out.println("Выберите питание");
                    view.printFood(base);
                    if (scanner.hasNextInt()) {

                        int choiceFood = scanner.nextInt();

                        if (choiceFood > 0 && choiceFood <= base.getDurations().length) {
                            travelPackageNew.setFood(base.getFoods(choiceFood));
                            boolNewPackage = true;
                        }
                    } else scanner.next();

                } while (!boolNewPackage);

                boolNewPackage=false;

                do {
                    System.out.println("Выберите транспорт");
                    view.printTransports(base);
                    if (scanner.hasNextInt()) {

                        int choiceTransport = scanner.nextInt();

                        if (choiceTransport > 0 && choiceTransport <= base.getTransports().length) {
                            travelPackageNew.setTransport(base.getTransports(choiceTransport));
                            boolNewPackage = true;
                        }
                    } else scanner.next();

                } while (!boolNewPackage);

                System.out.println("Спасибо, формирую вашу путевку....");
                Thread.sleep(5000);
                System.out.println(travelPackageNew.toString());

                break;

            ///////////////////////////////

            case ("q"):

                System.out.println("Выход из программы");
                
                break;
        }
    }
}


