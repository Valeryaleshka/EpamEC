/*Задача 4. Создать консольное приложение, удовлетворяющее следующим требованиям:  • Приложение должно быть объектно-,
а не процедурно-ориентированным. Каждый класс должен иметь отражающее смысл название и информативный состав.
Наследование должно применяться только тогда, когда это имеет смысл. При кодировании должны быть использованы соглашения
об оформлении кода java code convention. Классы должны быть грамотно разложены по пакетам.
Консольное меню должно быть минимальным. Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
*/
package by.epam.oop.task4.main;

import by.epam.oop.task4.theDragonsCave.TheDragonsCave;
import by.epam.oop.task4.theDragonsCave.treasure.TreasureLogic;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        View view = new View();
        TreasureLogic treasureLogic = new TreasureLogic();
        TheDragonsCave theDragonsCave = new TheDragonsCave();

        treasureLogic.addTreasureFromTXT("C:\\Users\\Valeronij\\IdeaProjects\\classes\\src\\by\\epam\\oop\\task4\\theDragonsCave\\treasure\\Treasures.txt", theDragonsCave);

        Scanner scanner = new Scanner(System.in);

        String choice = null;

        boolean bool = false;
        do {
            System.out.println("1 - Посмотреть все сокровища, 2 - Посмтореть сокровище N.. ,3 - посмотреть самое дорогое сокровище ,4 - Собрать сокровищ на сумму");

            if (scanner.hasNextInt()) {

                int choiceInt = scanner.nextInt();

                if (choiceInt > 0 && choiceInt < 5) {
                    choice = Integer.toString(choiceInt);
                    bool = true;
                }
            } else scanner.next();

        } while (!bool);


        switch (choice) {

            case ("1"):

                view.printAllTreasures(theDragonsCave);
                break;

            //////////////////////////////////////////////////////////////////////////

            case ("2"):

                int choiceTreasure = 0;

                boolean boolOfChoiceTreasure = false;

                do {
                    System.out.println("Введите номер");

                    if (scanner.hasNextInt()) {

                        choiceTreasure = scanner.nextInt();

                        if (choiceTreasure > 0 && choiceTreasure < theDragonsCave.getTreasures().length-1) {
                            boolOfChoiceTreasure = true;
                        }
                    } else scanner.next();

                } while (!boolOfChoiceTreasure);

                view.printTreasureFromDragonCave(theDragonsCave,choiceTreasure);

                break;
///////////////////////////////

            case ("3"):
                view.printTheMostExpensiveTreasure(treasureLogic.getTheMostExpensiveTreasure(theDragonsCave));

                break;

            ///////////////////////////////

            case ("4"):
                int totalCost = 0;

                boolean boolOfTotalCost = false;

                do {
                    System.out.println("Введите сумму");

                    if (scanner.hasNextInt()) {

                        totalCost = scanner.nextInt();

                        if (totalCost > 0) {
                            boolOfTotalCost = true;
                        }
                    } else scanner.next();

                } while (!boolOfTotalCost);

                view.printAllTreasures(treasureLogic.getTreasureTotalCost(theDragonsCave,totalCost));

                break;
        }
    }





}
