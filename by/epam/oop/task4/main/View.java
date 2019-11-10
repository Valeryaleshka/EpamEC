package by.epam.oop.task4.main;

import by.epam.oop.task4.theDragonsCave.TheDragonsCave;
import by.epam.oop.task4.theDragonsCave.Treasure;
import by.epam.oop.task4.theDragonsCave.TreasureLogic;

public class View {

    private TreasureLogic treasureLogic = new TreasureLogic();

    public void printAllTreasures(TheDragonsCave theDragonsCave){
        int count = 1;
        for (Treasure treasure:theDragonsCave.getTreasures()) {
            System.out.println("Сокровище - N"+count+". "+ treasure.getTreasureName()+" стоимость - "+ treasure.getTreasureCost());
            count++;
        }
    }

    public void printTreasureFromDragonCave(TheDragonsCave theDragonsCave, int numberOfTreasure){
        System.out.println("Сокровище - "+ theDragonsCave.getTreasure(numberOfTreasure-1).getTreasureName()
                         +" стоимость - "+ theDragonsCave.getTreasure(numberOfTreasure-1).getTreasureCost());
    }

    public void printTheMostExpensiveTreasure(Treasure treasure){
        System.out.println("Сокровище - "+ treasure.getTreasureName()
                +" стоимость - "+ treasure.getTreasureCost());
    }

    public void printAllTreasures(Treasure [] treasures){
        int count = 1;
        for (Treasure treasure:treasures) {
            System.out.println("Сокровище - N"+count+". "+ treasure.getTreasureName()+" стоимость - "+ treasure.getTreasureCost());
            count++;
        }
    }
}
